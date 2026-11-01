package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public final class iw extends hk3 {
    @Override // yads.hk3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f77508b == gwVar.f77953a) {
            textView.setText(gwVar.f77954b);
        }
    }

    public iw(TextView textView) {
        super(textView);
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f77508b == gwVar.f77953a) {
            return ck.p.e(textView.getText().toString(), gwVar.f77954b);
        }
        return true;
    }
}
