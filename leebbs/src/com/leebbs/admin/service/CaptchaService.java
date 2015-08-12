package com.leebbs.admin.service;

import java.awt.image.BufferedImage;

import com.leebbs.core.utils.Setting;



public abstract interface CaptchaService
{
	public abstract BufferedImage buildImage(String captchaId);
	
	public abstract boolean isValid(Setting.CaptchaType captchaType, String captchaId, String captcha);
}