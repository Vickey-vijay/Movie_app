package sg.bigo.ads.controller.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.common.form.a;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.landing.e;

/* JADX INFO: loaded from: classes5.dex */
public class AdFormActivity extends Activity implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private c<?, ?> f70885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f70888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f70890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private sg.bigo.ads.common.form.c f70891g;

    @NonNull
    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AdFormActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a() {
        this.f70888d = true;
        c<?, ?> cVar = this.f70885a;
        if (cVar != null) {
            cVar.f67545j = true;
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        e.a(this, this, str, this.f70885a);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if ((currentFocus instanceof EditText) && !u.a(currentFocus, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentFocus.clearFocus();
                try {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                } catch (Throwable unused) {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f70888d) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        sg.bigo.ads.api.core.b bVar;
        c<?, ?> cVar;
        Locale locale;
        super.onCreate(bundle);
        try {
            this.f70886b = getIntent().getIntExtra("ad_identifier", -1);
            this.f70889e = getIntent().getIntExtra("open_form_time", 0);
            c<?, ?> cVarB = e.b(this.f70886b);
            this.f70885a = cVarB;
            if (cVarB == null) {
                finish();
                return;
            }
            int iHashCode = cVarB.f().hashCode();
            this.f70887c = iHashCode;
            this.f70890f = a.a(iHashCode);
            setContentView(R.layout.bigo_ad_activity_form);
            Window window = getWindow();
            if (window != null) {
                s.a(window);
            }
            View viewFindViewById = findViewById(R.id.bigo_ad_btn_close);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.controller.form.AdFormActivity.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdFormActivity.this.finish();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.inter_main);
            if (frameLayout == null || (cVar = this.f70885a) == null) {
                return;
            }
            sg.bigo.ads.api.a.e eVarF = cVar.f().f();
            String strE = eVarF.e();
            a.f69546a = strE;
            switch (strE) {
                case "ar":
                    locale = new Locale("ar", "");
                    break;
                case "es":
                    locale = new Locale("es", "");
                    break;
                case "fa":
                    locale = new Locale("fa", "");
                    break;
                case "he":
                    locale = new Locale("he", "");
                    break;
                case "hi":
                    locale = new Locale("hi", "");
                    break;
                case "id":
                    locale = new Locale("id", "");
                    break;
                case "ms":
                    locale = new Locale("ms", "");
                    break;
                case "pt":
                    locale = new Locale("pt", "");
                    break;
                case "ru":
                    locale = new Locale("ru", "");
                    break;
                case "tr":
                    locale = new Locale("tr", "");
                    break;
                case "th":
                    locale = new Locale("th", "");
                    break;
                case "uz":
                    locale = new Locale("uz", "");
                    break;
                case "vi":
                    locale = new Locale("vi", "");
                    break;
                case "de":
                    locale = Locale.GERMAN;
                    break;
                case "ja":
                    locale = Locale.JAPANESE;
                    break;
                case "ko":
                    locale = Locale.KOREAN;
                    break;
                case "fr":
                    locale = Locale.FRENCH;
                    break;
                default:
                    locale = Locale.ENGLISH;
                    break;
            }
            a.f69547b = locale;
            boolean z10 = this.f70885a.f67545j;
            this.f70888d = z10;
            sg.bigo.ads.common.form.c cVarA = sg.bigo.ads.common.form.c.a(this, eVarF, this.f70890f, z10, this.f70889e, this.f70887c, this);
            this.f70891g = cVarA;
            bVar = null;
            try {
                u.a(cVarA.f69558b, frameLayout, null, -1);
                this.f70891g.f69559c.c();
            } catch (Throwable th2) {
                th = th2;
                c<?, ?> cVar2 = this.f70885a;
                sg.bigo.ads.core.d.b.a(cVar2 != null ? cVar2.f() : bVar, 3000, 10221, Log.getStackTraceString(th));
                finish();
            }
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onDestroy() {
        sg.bigo.ads.common.form.c cVar;
        b bVar;
        super.onDestroy();
        try {
            if (this.f70885a != null && (cVar = this.f70891g) != null && (bVar = cVar.f69557a) != null) {
                Map<String, Object> mapA = a.a(bVar.f69590b, bVar.f69591c.b(), bVar.f69591c.a());
                boolean z10 = this.f70888d;
                if (!z10) {
                    a.a(this.f70887c, mapA);
                } else if (z10) {
                    a.a(this.f70887c, 3);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
