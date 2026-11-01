package yads;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r9 {
    public static TextView a(Context context) {
        TextView textView = new TextView(context, null, R.style.Widget.TextView);
        textView.setTextSize(0, kl3.a(context, t9.f82927f.a(context)));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(context.getResources().getColor(R.color.primary_text_light));
        int iC = ek.b.c(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(iC, 0, iC, 0);
        return textView;
    }

    public static ProgressBar b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setProgressDrawable(q9.f81774b);
        progressBar.setProgress(0);
        progressBar.setMax(10000);
        return progressBar;
    }

    public static ImageView a(Context context, String str, int i10) {
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(tb.a(str));
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(i10, i10, i10, i10);
        ColorDrawable colorDrawable = q9.f81773a;
        ColorDrawable colorDrawable2 = new ColorDrawable(p9.f81309a);
        ColorDrawable colorDrawable3 = new ColorDrawable(0);
        int[] iArr = {R.attr.state_pressed};
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr, colorDrawable2);
        stateListDrawable.addState(new int[0], colorDrawable3);
        imageView.setBackgroundDrawable(stateListDrawable);
        return imageView;
    }
}
