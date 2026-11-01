package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class tg2 {
    public static Intent a(Context context, sg2 sg2Var) {
        String str = sg2Var.f82634b;
        String str2 = sg2Var.f82633a;
        String str3 = sg2Var.f82641i;
        Map map = sg2Var.f82635c;
        Integer num = sg2Var.f82636d;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setClassName(str2, str3);
        } else {
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
        }
        if (num == null || !(context instanceof Activity)) {
            intent.addFlags(1342177280 | (num != null ? num.intValue() : 0));
        } else {
            intent.addFlags(num.intValue());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str4, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str4, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(str4, (String) value);
                } else if (value instanceof tq0) {
                    try {
                        Result.a aVar = Result.Companion;
                        Result.m3458constructorimpl(intent.putExtra(str4, ((tq0) value).getValue()));
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        Result.m3458constructorimpl(kotlin.c.a(th2));
                    }
                }
            }
        }
        return intent;
    }
}
