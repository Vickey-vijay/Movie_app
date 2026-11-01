package xyz.doikki.videocontroller.component;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bp.c;
import com.applovin.sdk.AppLovinEventTypes;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes11.dex */
public class TitleView extends FrameLayout implements yo.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo.a f75125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f75126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f75127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f75128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f75129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75130g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activityL = c.l(TitleView.this.getContext());
            if (activityL == null || !TitleView.this.f75125b.isFullScreen()) {
                return;
            }
            activityL.setRequestedOrientation(1);
            TitleView.this.f75125b.stopFullScreen();
        }
    }

    public TitleView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_title_view, (ViewGroup) this, true);
        this.f75126c = (LinearLayout) findViewById(R$id.title_container);
        ((ImageView) findViewById(R$id.back)).setOnClickListener(new a());
        this.f75127d = (TextView) findViewById(R$id.title);
        this.f75128e = (TextView) findViewById(R$id.sys_time);
        this.f75129f = new b((ImageView) findViewById(R$id.iv_battery));
    }

    @Override // yo.b
    public void f(int i10, int i11) {
    }

    @Override // yo.b
    public View getView() {
        return this;
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        if (i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 5 || i10 == 8) {
            setVisibility(8);
        }
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 11) {
            if (this.f75125b.isShowing() && !this.f75125b.isLocked()) {
                setVisibility(0);
                this.f75128e.setText(c.b());
            }
            this.f75127d.setSelected(true);
        } else {
            setVisibility(8);
            this.f75127d.setSelected(false);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f75125b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f75125b.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f75126c.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f75126c.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f75126c.setPadding(0, 0, cutoutHeight, 0);
        }
    }

    public static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f75132a;

        public b(ImageView imageView) {
            this.f75132a = imageView;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            this.f75132a.getDrawable().setLevel((extras.getInt(AppLovinEventTypes.USER_COMPLETED_LEVEL) * 100) / extras.getInt("scale"));
        }
    }

    @Override // yo.b
    public void a(@NonNull yo.a aVar) {
        this.f75125b = aVar;
    }

    @Override // yo.b
    public void b(boolean z10) {
        if (z10) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f75128e.setText(c.b());
        }
    }

    @Override // yo.b
    public void e(boolean z10, Animation animation) {
        if (this.f75125b.isFullScreen()) {
            if (!z10) {
                if (getVisibility() == 0) {
                    setVisibility(8);
                    if (animation != null) {
                        startAnimation(animation);
                        return;
                    }
                    return;
                }
                return;
            }
            if (getVisibility() == 8) {
                this.f75128e.setText(c.b());
                setVisibility(0);
                if (animation != null) {
                    startAnimation(animation);
                }
            }
        }
    }

    public void setTitle(String str) {
        this.f75127d.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f75130g) {
            getContext().registerReceiver(this.f75129f, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f75130g = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f75130g) {
            getContext().unregisterReceiver(this.f75129f);
            this.f75130g = false;
        }
    }

    public TitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_title_view, (ViewGroup) this, true);
        this.f75126c = (LinearLayout) findViewById(R$id.title_container);
        ((ImageView) findViewById(R$id.back)).setOnClickListener(new a());
        this.f75127d = (TextView) findViewById(R$id.title);
        this.f75128e = (TextView) findViewById(R$id.sys_time);
        this.f75129f = new b((ImageView) findViewById(R$id.iv_battery));
    }

    public TitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_title_view, (ViewGroup) this, true);
        this.f75126c = (LinearLayout) findViewById(R$id.title_container);
        ((ImageView) findViewById(R$id.back)).setOnClickListener(new a());
        this.f75127d = (TextView) findViewById(R$id.title);
        this.f75128e = (TextView) findViewById(R$id.sys_time);
        this.f75129f = new b((ImageView) findViewById(R$id.iv_battery));
    }
}
