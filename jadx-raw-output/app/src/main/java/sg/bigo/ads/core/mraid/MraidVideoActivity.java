package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.utils.Logger;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes5.dex */
public class MraidVideoActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediaView f71573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoController f71574b;

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, MraidVideoActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("INTENT_VIDEO_URL", str);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            String stringExtra = getIntent().getStringExtra("INTENT_VIDEO_URL");
            MediaView mediaView = new MediaView(this);
            this.f71573a = mediaView;
            mediaView.a(stringExtra);
            this.f71574b = this.f71573a.getVideoController();
            this.f71573a.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.mraid.MraidVideoActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MraidVideoActivity.this.f71574b != null) {
                        if (MraidVideoActivity.this.f71574b.isPlaying()) {
                            MraidVideoActivity.this.f71574b.pause();
                        } else {
                            MraidVideoActivity.this.f71574b.play();
                        }
                    }
                }
            });
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.bigo_ad_ic_close);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.mraid.MraidVideoActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MraidVideoActivity.this.finish();
                }
            });
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            frameLayout.addView(this.f71573a, new FrameLayout.LayoutParams(-1, -2, 17));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(this, 25), sg.bigo.ads.common.utils.e.a(this, 25), BadgeDrawable.TOP_START);
            layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(this, 15);
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this, 25);
            frameLayout.addView(imageView, layoutParams);
            setContentView(frameLayout);
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            VideoController videoController = this.f71574b;
            if (videoController != null) {
                videoController.pause();
            }
            MediaView mediaView = this.f71573a;
            if (mediaView != null) {
                mediaView.c();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            VideoController videoController = this.f71574b;
            if (videoController != null) {
                videoController.pause();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            VideoController videoController = this.f71574b;
            if (videoController != null) {
                videoController.play();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
