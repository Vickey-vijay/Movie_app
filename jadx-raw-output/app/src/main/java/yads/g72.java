package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import yads.g72;

/* JADX INFO: loaded from: classes5.dex */
public final class g72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai3 f77664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w52 f77665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f77666c;

    public /* synthetic */ g72(p52 p52Var, ai3 ai3Var) {
        this(ai3Var, new w52(p52Var));
    }

    public final void a(gl1 gl1Var) {
        if (gl1Var != null) {
            final CheckBox muteControl = gl1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: cp.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        g72.a(this.f51239b, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f77664a.f75532b ? 0 : 8);
            }
            ProgressBar videoProgress = gl1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f77664a.f75533c ? 8 : 0);
            }
            TextView countDownProgress = gl1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    public g72(ai3 ai3Var, w52 w52Var) {
        double dDoubleValue;
        this.f77664a = ai3Var;
        this.f77665b = w52Var;
        Double dA = ai3Var.a();
        if (dA == null) {
            dDoubleValue = 1.0d;
        } else {
            dA = ((dA.doubleValue() > 0.0d ? 1 : (dA.doubleValue() == 0.0d ? 0 : -1)) == 0) ^ true ? dA : null;
            if (dA != null) {
                dDoubleValue = dA.doubleValue();
            } else {
                dDoubleValue = 1.0d;
            }
        }
        this.f77666c = dDoubleValue;
    }

    public static final void a(g72 g72Var, CheckBox checkBox, View view) {
        double d10 = checkBox.isChecked() ^ true ? g72Var.f77666c : 0.0d;
        w52 w52Var = g72Var.f77665b;
        w52Var.getClass();
        w52Var.f84111a.setVolume((float) d10);
    }
}
