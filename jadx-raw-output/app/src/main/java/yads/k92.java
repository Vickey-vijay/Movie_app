package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes6.dex */
public final class k92 implements iy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79341a;

    @Override // yads.iy1
    public final View a(View view, String str) {
        View viewFindViewWithTag = view.findViewWithTag(str + "_" + this.f79341a);
        if (viewFindViewWithTag instanceof View) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView a(View view) {
        View viewFindViewWithTag = view.findViewWithTag("body_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final CheckBox b(View view) {
        View viewFindViewWithTag = view.findViewWithTag("mute_button_" + this.f79341a);
        if (viewFindViewWithTag instanceof CheckBox) {
            return (CheckBox) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final CustomizableMediaView c(View view) {
        View viewFindViewWithTag = view.findViewWithTag("media_" + this.f79341a);
        if (viewFindViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView d(View view) {
        View viewFindViewWithTag = view.findViewWithTag("price_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView e(View view) {
        View viewFindViewWithTag = view.findViewWithTag("call_to_action_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView f(View view) {
        View viewFindViewWithTag = view.findViewWithTag("warning_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final ImageView g(View view) {
        View viewFindViewWithTag = view.findViewWithTag("favicon_" + this.f79341a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView h(View view) {
        View viewFindViewWithTag = view.findViewWithTag("age_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final View i(View view) {
        View viewFindViewWithTag = view.findViewWithTag("rating_" + this.f79341a);
        if (viewFindViewWithTag instanceof View) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView j(View view) {
        View viewFindViewWithTag = view.findViewWithTag("title_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final ProgressBar k(View view) {
        return (ProgressBar) view.findViewWithTag("video_progress_" + this.f79341a);
    }

    @Override // yads.iy1
    public final ImageView l(View view) {
        View viewFindViewWithTag = view.findViewWithTag("feedback_" + this.f79341a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView m(View view) {
        View viewFindViewWithTag = view.findViewWithTag("sponsored_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView n(View view) {
        View viewFindViewWithTag = view.findViewWithTag("domain_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final ImageView o(View view) {
        View viewFindViewWithTag = view.findViewWithTag("icon_" + this.f79341a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // yads.iy1
    public final TextView p(View view) {
        View viewFindViewWithTag = view.findViewWithTag("review_count_" + this.f79341a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    public k92(int i10) {
        this.f79341a = i10;
    }
}
