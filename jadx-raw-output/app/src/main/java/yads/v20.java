package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class v20 implements gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBox f83726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f83727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f83728c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return ck.p.e(this.f83726a, v20Var.f83726a) && ck.p.e(this.f83727b, v20Var.f83727b) && ck.p.e(this.f83728c, v20Var.f83728c);
    }

    @Override // yads.gl1
    public final TextView getCountDownProgress() {
        return this.f83728c;
    }

    @Override // yads.gl1
    public final CheckBox getMuteControl() {
        return this.f83726a;
    }

    @Override // yads.gl1
    public final ProgressBar getVideoProgress() {
        return this.f83727b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f83726a;
        int iHashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f83727b;
        int iHashCode2 = (iHashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f83728c;
        return iHashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f83726a + ", videoProgress=" + this.f83727b + ", countDownProgress=" + this.f83728c + ")";
    }

    public v20(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f83726a = checkBox;
        this.f83727b = progressBar;
        this.f83728c = textView;
    }
}
