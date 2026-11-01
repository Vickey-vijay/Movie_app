package me.goldze.mvvmhabit.crash;

import android.R;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import me.goldze.mvvmhabit.R$dimen;
import me.goldze.mvvmhabit.R$id;
import me.goldze.mvvmhabit.R$layout;
import me.goldze.mvvmhabit.R$string;
import me.goldze.mvvmhabit.R$style;
import me.goldze.mvvmhabit.R$styleable;

/* JADX INFO: loaded from: classes6.dex */
public final class DefaultErrorActivity extends AppCompatActivity {

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CaocConfig f64454b;

        public a(CaocConfig caocConfig) {
            this.f64454b = caocConfig;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CustomActivityOnCrash.H(DefaultErrorActivity.this, this.f64454b);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CaocConfig f64456b;

        public b(CaocConfig caocConfig) {
            this.f64456b = caocConfig;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CustomActivityOnCrash.o(DefaultErrorActivity.this, this.f64456b);
        }
    }

    public class c implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                DefaultErrorActivity.this.l();
                Toast.makeText(DefaultErrorActivity.this, R$string.customactivityoncrash_error_activity_error_details_copied, 0).show();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog.Builder title = new AlertDialog.Builder(DefaultErrorActivity.this).setTitle(R$string.customactivityoncrash_error_activity_error_details_title);
            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
            ((TextView) title.setMessage(CustomActivityOnCrash.q(defaultErrorActivity, defaultErrorActivity.getIntent())).setPositiveButton(R$string.customactivityoncrash_error_activity_error_details_close, (DialogInterface.OnClickListener) null).setNeutralButton(R$string.customactivityoncrash_error_activity_error_details_copy, new a()).show().findViewById(R.id.message)).setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(R$dimen.customactivityoncrash_error_activity_error_details_text_size));
        }
    }

    public final void l() {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(getString(R$string.customactivityoncrash_error_activity_error_details_clipboard_label), CustomActivityOnCrash.q(this, getIntent())));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"PrivateResource"})
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(R$styleable.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
            setTheme(R$style.Theme_AppCompat_Light_DarkActionBar);
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentView(R$layout.customactivityoncrash_default_error_activity);
        Button button = (Button) findViewById(R$id.customactivityoncrash_error_activity_restart_button);
        CaocConfig caocConfigT = CustomActivityOnCrash.t(getIntent());
        if (caocConfigT.isShowRestartButton() && caocConfigT.getRestartActivityClass() != null) {
            button.setText(R$string.customactivityoncrash_error_activity_restart_app);
            button.setOnClickListener(new a(caocConfigT));
        } else {
            button.setOnClickListener(new b(caocConfigT));
        }
        Button button2 = (Button) findViewById(R$id.customactivityoncrash_error_activity_more_info_button);
        if (caocConfigT.isShowErrorDetails()) {
            button2.setOnClickListener(new c());
        } else {
            button2.setVisibility(8);
        }
        Integer errorDrawable = caocConfigT.getErrorDrawable();
        ImageView imageView = (ImageView) findViewById(R$id.customactivityoncrash_error_activity_image);
        if (errorDrawable != null) {
            imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), errorDrawable.intValue(), getTheme()));
        }
    }
}
