package com.yk.e.util;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public class IDUtil {
    public static int getDimen(Context context, String str) {
        return context.getResources().getIdentifier(str, "dimen", context.getPackageName());
    }

    public static int getDrawable(Context context, String str) {
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    public static int getLayoutID(Context context, String str) {
        return context.getResources().getIdentifier(str, "layout", context.getPackageName());
    }

    public static String getString(Context context, String str) {
        try {
            return context.getString(context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName()));
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return "";
        }
    }

    public static int getStyle(Context context, String str) {
        return context.getResources().getIdentifier(str, "style", context.getPackageName());
    }

    public static int getViewID(Context context, String str) {
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }
}
