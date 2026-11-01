package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: loaded from: classes10.dex */
public class MBFeedBackDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Button f39651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f39652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f39653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f39654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Button f39655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f39656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39658h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f39654d != null) {
                MBFeedBackDialog.this.f39654d.b();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f39654d != null) {
                MBFeedBackDialog.this.f39654d.a();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBFeedBackDialog.this.dismiss();
            if (MBFeedBackDialog.this.f39654d != null) {
                MBFeedBackDialog.this.f39654d.c();
            }
        }
    }

    public class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (MBFeedBackDialog.this.f39654d != null) {
                MBFeedBackDialog.this.f39654d.a();
            }
        }
    }

    public void setConfirmText(String str) {
    }

    public MBFeedBackDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(i0.a(context, "mbridge_cm_feedbackview", "layout"), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f39654d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f39656f = (TextView) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e10) {
                q0.a("MBAlertDialog", e10.getMessage());
            }
            try {
                this.f39653c = (LinearLayout) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f39652b = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f39651a = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f39655e = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e11) {
                q0.a("MBAlertDialog", e11.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        a();
    }

    private void a() {
        Button button = this.f39651a;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        Button button2 = this.f39652b;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
        Button button3 = this.f39655e;
        if (button3 != null) {
            button3.setOnClickListener(new c());
        }
        setOnCancelListener(new d());
    }

    public void clear() {
        if (this.f39654d != null) {
            this.f39654d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.f39654d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            f1.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z10) {
        Button button = this.f39651a;
        if (button != null) {
            button.setClickable(z10);
            if (z10) {
                this.f39651a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
                this.f39651a.setAlpha(1.0f);
            } else {
                this.f39651a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
                this.f39651a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f39651a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f39653c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 16.0f);
            layoutParams.rightMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 16.0f);
            layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 3.0f);
            layoutParams.bottomMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 3.0f);
            this.f39653c.addView(viewGroup, layoutParams);
        }
    }

    public void setListener(com.mbridge.msdk.widget.dialog.b bVar) {
        this.f39654d = bVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.f39655e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f39656f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public void setDialogWidthAndHeight(float f10, float f11) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (isScreenOrientationPortrait(getContext())) {
            this.f39658h = displayMetrics.widthPixels;
            this.f39657g = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i10 = (int) (this.f39657g * f11);
            attributes.width = -1;
            attributes.height = i10;
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f39658h = displayMetrics.heightPixels;
        this.f39657g = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (this.f39657g * f10);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e10) {
            q0.b("MBAlertDialog", e10.getMessage());
            super.show();
        }
    }
}
