package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class InneractiveUserConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15306a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Gender f15307b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15308c = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i10) {
        return i10 >= 1 && i10 <= 120;
    }

    public int getAge() {
        return this.f15306a;
    }

    public Gender getGender() {
        return this.f15307b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f15308c;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f15307b = gender;
        } else {
            IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        } else {
            this.f15308c = str;
        }
        return this;
    }

    public InneractiveUserConfig setAge(int i10) {
        if (ageIsValid(i10)) {
            this.f15306a = i10;
        } else {
            IAlog.f("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        }
        return this;
    }
}
