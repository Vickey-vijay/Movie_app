package com.ironsource.mediationsdk.metadata;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        return (str == null || str.length() > 2048) ? "The MetaData key you entered is invalid. Please enter a key of maximum 2048 characters." : "";
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        if (metaDataValueTypes != MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN) {
            return str;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
            return "true";
        }
        return (str.equalsIgnoreCase(a.f29886h) || str.equalsIgnoreCase("no")) ? a.f29886h : "";
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals(a.f29886h);
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        return (str.equalsIgnoreCase(a.f29879a) || str.equalsIgnoreCase(a.f29880b) || str.equalsIgnoreCase(a.f29881c) || str.equalsIgnoreCase(a.f29882d)) ? MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(String str) {
        return a.f29891m.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return a.f29890l.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationOnlyKey(String str) {
        return a.f29889k.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return isValidMetaData(str, a.f29879a, str2);
    }

    public static String checkMetaDataValueValidity(List<String> list) {
        if (list.isEmpty()) {
            return "The MetaData list should include at least one element.";
        }
        for (String str : list) {
            if (str == null || str.length() > 2048) {
                return "The MetaData value(s) you entered is invalid. Please enter a value of maximum 2048 characters.";
            }
        }
        return "";
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (!isKnownKey(str)) {
            return new MetaData(str, list);
        }
        String lowerCase = StringUtils.toLowerCase(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
            String valueForType = formatValueForType(str2, valueTypeForKey);
            arrayList.add(valueTypeForKey);
            arrayList2.add(valueForType);
        }
        return new MetaData(lowerCase, arrayList2, arrayList);
    }

    public static boolean isValidMetaData(String str, String str2, String str3) {
        if (str.equalsIgnoreCase(str2) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        return false;
    }
}
