package gb;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.fvvcl.flickverse.R;

/* JADX INFO: compiled from: ShowAdLoadingPop.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f53321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f53322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f53323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimationDrawable f53324d;

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public d(Context context) {
        super(context);
        this.f53323c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_ad_loading, (ViewGroup) null);
        this.f53321a = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.loadingImageView);
        this.f53322b = imageView;
        this.f53324d = (AnimationDrawable) imageView.getBackground();
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(false);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }
}
