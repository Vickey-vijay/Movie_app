package com.luck.picture.lib.adapter.holder;

import a8.e;
import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.SelectMainStyle;
import o8.q;

/* JADX INFO: loaded from: classes4.dex */
public class CameraViewHolder extends BaseRecyclerMediaHolder {
    public CameraViewHolder(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R$id.tvCamera);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int iC = selectMainStyleC.c();
        if (q.c(iC)) {
            textView.setBackgroundColor(iC);
        }
        int iD = selectMainStyleC.d();
        if (q.c(iD)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, iD, 0, 0);
        }
        String strE = selectMainStyleC.e();
        if (q.f(strE)) {
            textView.setText(strE);
        } else if (PictureSelectionConfig.e().f32200b == e.b()) {
            textView.setText(view.getContext().getString(R$string.ps_tape));
        }
        int iG = selectMainStyleC.g();
        if (q.b(iG)) {
            textView.setTextSize(iG);
        }
        int iF = selectMainStyleC.f();
        if (q.c(iF)) {
            textView.setTextColor(iF);
        }
    }
}
