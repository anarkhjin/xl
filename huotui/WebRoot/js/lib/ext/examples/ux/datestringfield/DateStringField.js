/*
 * ! Ext JS Library 3.4.0 Copyright(c) 2006-2011 Sencha Inc.
 * licensing@sencha.com http://www.sencha.com/license
 */

/**
 * @author yangxy
 * 
 * DateStringField是根据DateField改编的一个Field控件，目的是在getValue的时候拿到的是String类型而不是Date类型
 * 一共改了3处：2处是关于getValue是否parseDate，另一处是Ext.reg的时候改为datestringfield
 */

Ext.ns('Ext.ux.form');
Ext.ux.form.DateStringField = Ext.extend(Ext.form.TriggerField, {
	format : "Y-m-d",
	altFormats : "m/d/Y|n/j/Y|n/j/y|m/j/y|n/d/y|m/j/Y|n/d/Y|m-d-y|m-d-Y|m/d|m-d|md|mdy|mdY|d|Y-m-d|n-j|n/j",
	disabledDaysText : "Disabled",
	disabledDatesText : "Disabled",
	minText : "The date in this field must be equal to or after {0}",
	maxText : "The date in this field must be equal to or before {0}",
	invalidText : "{0} is not a valid date - it must be in the format {1}",
	triggerClass : "x-form-date-trigger",
	showToday : true,
	startDay : 0,
	defaultAutoCreate : {
		tag : "input",
		type : "text",
		size : "10",
		autocomplete : "off"
	},
	initTime : "12",
	initTimeFormat : "H",
	safeParse : function(b, c) {
		if (/[gGhH]/.test(c.replace(/(\\.)/g, ""))) {
			return Date.parseDate(b, c)
		} else {
			var a = Date.parseDate(b + " " + this.initTime, c + " "
							+ this.initTimeFormat);
			if (a) {
				return a.clearTime()
			}
		}
	},
	initComponent : function() {
		Ext.ux.form.DateStringField.superclass.initComponent.call(this);
		this.addEvents("select");
		if (Ext.isString(this.minValue)) {
			this.minValue = this.parseDate(this.minValue)
		}
		if (Ext.isString(this.maxValue)) {
			this.maxValue = this.parseDate(this.maxValue)
		}
		this.disabledDatesRE = null;
		this.initDisabledDays()
	},
	initEvents : function() {
		Ext.ux.form.DateStringField.superclass.initEvents.call(this);
		this.keyNav = new Ext.KeyNav(this.el, {
					down : function(a) {
						this.onTriggerClick()
					},
					scope : this,
					forceKeyDown : true
				})
	},
	initDisabledDays : function() {
		if (this.disabledDates) {
			var b = this.disabledDates, a = b.length - 1, c = "(?:";
			Ext.each(b, function(g, e) {
						c += Ext.isDate(g)
								? "^" + Ext.escapeRe(g.dateFormat(this.format))
										+ "$"
								: b[e];
						if (e != a) {
							c += "|"
						}
					}, this);
			this.disabledDatesRE = new RegExp(c + ")")
		}
	},
	setDisabledDates : function(a) {
		this.disabledDates = a;
		this.initDisabledDays();
		if (this.menu) {
			this.menu.picker.setDisabledDates(this.disabledDatesRE)
		}
	},
	setDisabledDays : function(a) {
		this.disabledDays = a;
		if (this.menu) {
			this.menu.picker.setDisabledDays(a)
		}
	},
	setMinValue : function(a) {
		this.minValue = (Ext.isString(a) ? this.parseDate(a) : a);
		if (this.menu) {
			this.menu.picker.setMinDate(this.minValue)
		}
	},
	setMaxValue : function(a) {
		this.maxValue = (Ext.isString(a) ? this.parseDate(a) : a);
		if (this.menu) {
			this.menu.picker.setMaxDate(this.maxValue)
		}
	},
	getErrors : function(e) {
		var h = Ext.ux.form.DateStringField.superclass.getErrors.apply(this,
				arguments);
		e = this.formatDate(e || this.processValue(this.getRawValue()));
		if (e.length < 1) {
			return h
		}
		var c = e;
		e = this.parseDate(e);
		if (!e) {
			h.push(String.format(this.invalidText, c, this.format));
			return h
		}
		var g = e.getTime();
		if (this.minValue && g < this.minValue.clearTime().getTime()) {
			h.push(String.format(this.minText, this.formatDate(this.minValue)))
		}
		if (this.maxValue && g > this.maxValue.clearTime().getTime()) {
			h.push(String.format(this.maxText, this.formatDate(this.maxValue)))
		}
		if (this.disabledDays) {
			var a = e.getDay();
			for (var b = 0; b < this.disabledDays.length; b++) {
				if (a === this.disabledDays[b]) {
					h.push(this.disabledDaysText);
					break
				}
			}
		}
		var d = this.formatDate(e);
		if (this.disabledDatesRE && this.disabledDatesRE.test(d)) {
			h.push(String.format(this.disabledDatesText, d))
		}
		return h
	},
	validateBlur : function() {
		return !this.menu || !this.menu.isVisible()
	},
	getValue : function() {
		return Ext.ux.form.DateStringField.superclass.getValue.call(this) || ""
	},
	setValue : function(a) {
		return Ext.ux.form.DateStringField.superclass.setValue.call(this, this
						.formatDate(this.parseDate(a)))
	},
	parseDate : function(g) {
		if (!g || Ext.isDate(g)) {
			return g
		}
		var b = this.safeParse(g, this.format), c = this.altFormats, e = this.altFormatsArray;
		if (!b && c) {
			e = e || c.split("|");
			for (var d = 0, a = e.length; d < a && !b; d++) {
				b = this.safeParse(g, e[d])
			}
		}
		return b
	},
	onDestroy : function() {
		Ext.destroy(this.menu, this.keyNav);
		Ext.ux.form.DateStringField.superclass.onDestroy.call(this)
	},
	formatDate : function(a) {
		return Ext.isDate(a) ? a.dateFormat(this.format) : a
	},
	onTriggerClick : function() {
		if (this.disabled) {
			return
		}
		if (this.menu == null) {
			this.menu = new Ext.menu.DateMenu({
						hideOnClick : false,
						focusOnSelect : false
					})
		}
		this.onFocus();
		Ext.apply(this.menu.picker, {
					minDate : this.minValue,
					maxDate : this.maxValue,
					disabledDatesRE : this.disabledDatesRE,
					disabledDatesText : this.disabledDatesText,
					disabledDays : this.disabledDays,
					disabledDaysText : this.disabledDaysText,
					format : this.format,
					showToday : this.showToday,
					startDay : this.startDay,
					minText : String.format(this.minText, this
									.formatDate(this.minValue)),
					maxText : String.format(this.maxText, this
									.formatDate(this.maxValue))
				});
		this.menu.picker
				.setValue(this.parseDate(this.getValue()) || new Date());
		this.menu.show(this.el, "tl-bl?");
		this.menuEvents("on")
	},
	menuEvents : function(a) {
		this.menu[a]("select", this.onSelect, this);
		this.menu[a]("hide", this.onMenuHide, this);
		this.menu[a]("show", this.onFocus, this)
	},
	onSelect : function(a, b) {
		this.setValue(b);
		this.fireEvent("select", this, b);
		this.menu.hide()
	},
	onMenuHide : function() {
		this.focus(false, 60);
		this.menuEvents("un")
	},
	beforeBlur : function() {
		var a = this.parseDate(this.getRawValue());
		if (a) {
			this.setValue(a)
		}
	}
});
Ext.reg("datestringfield", Ext.ux.form.DateStringField);


Date.monthNames = [
   "一月",
   "二月",
   "三月",
   "四月",
   "五月",
   "六月",
   "七月",
   "八月",
   "九月",
   "十月",
   "十一月",
   "十二月"
];

Date.dayNames = [
   "日",
   "一",
   "二",
   "三",
   "四",
   "五",
   "六"
];

if(Ext.util.Format){
   Ext.util.Format.date = function(v, format){
      if(!v) return "";
      if(!(v instanceof Date)) v = new Date(Date.parse(v));
      return v.dateFormat(format || "y年m月d日");
   };
}

if(Ext.DatePicker){
   Ext.apply(Ext.DatePicker.prototype, {
      todayText         : "今天",
      minText           : "日期在最小日期之前",
      maxText           : "日期在最大日期之后",
      disabledDaysText  : "",
      disabledDatesText : "",
      monthNames        : Date.monthNames,
      dayNames          : Date.dayNames,
      nextText          : '下月 (Control+Right)',
      prevText          : '上月 (Control+Left)',
      monthYearText     : '选择一个月 (Control+Up/Down 来改变年)',
      todayTip          : "{0} (空格键选择)",
      format            : "y年m月d日",
      okText            : "确定",
      cancelText        : "取消"
   });
}

if(Ext.ux.form.DateStringField){
   Ext.apply(Ext.ux.form.DateStringField.prototype, {
      disabledDaysText  : "禁用",
      disabledDatesText : "禁用",
      minText           : "该输入项的日期必须在 {0} 之后",
      maxText           : "该输入项的日期必须在 {0} 之前",
      invalidText       : "{0} 是无效的日期 - 必须符合格式： {1}",
      format            : "Y-m-d"
   });
}