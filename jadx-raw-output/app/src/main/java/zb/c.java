package zb;

import android.graphics.Paint;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: TextViewUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f86390a;

    public static c a() {
        if (f86390a == null) {
            synchronized (c.class) {
                if (f86390a == null) {
                    f86390a = new c();
                }
            }
        }
        return f86390a;
    }

    public float b(TextView textView, int i10, int i11, int i12, int i13) {
        if (textView == null) {
            return 0.0f;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        float fAbs = Math.abs(fontMetrics.bottom - fontMetrics.top) * textView.getLineCount();
        float height = (((textView.getHeight() - i10) - i11) - i12) - i13;
        return fAbs > height ? height : fAbs;
    }

    public float c(TextView textView, int i10, int i11, int i12, int i13) {
        float fMeasureText;
        if (textView == null) {
            return 0.0f;
        }
        String string = textView.getText().toString();
        if (string.contains("\n")) {
            String[] strArrSplit = string.split("\n");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                arrayList.add(Float.valueOf(textView.getPaint().measureText(str)));
            }
            fMeasureText = ((Float) Collections.max(arrayList)).floatValue();
        } else {
            fMeasureText = textView.getPaint().measureText(string);
        }
        float width = (((textView.getWidth() - i10) - i11) - i12) - i13;
        return fMeasureText > width ? width : fMeasureText;
    }
}
