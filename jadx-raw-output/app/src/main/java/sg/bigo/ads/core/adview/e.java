package sg.bigo.ads.core.adview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.s;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f71089b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f71090a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ViewGroup f71091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f71092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f71093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f71094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f71095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f71096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f71097g;

        public a(@NonNull ViewGroup viewGroup) {
            this.f71091a = viewGroup;
        }
    }

    public class b extends Dialog {
        public b(@NonNull Context context) {
            super(context, R.style.Dialog_FullScreen);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public final void dismiss() {
            super.dismiss();
            e.a();
        }

        @Override // android.app.Dialog
        public final void onCreate(Bundle bundle) {
            View viewFindViewById;
            super.onCreate(bundle);
            View viewA = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_optionview_feedback, null, false);
            setContentView(viewA);
            e.a(getWindow());
            if (!TextUtils.isEmpty(e.this.f71090a.f71092b)) {
                View viewFindViewById2 = findViewById(R.id.bigo_ad_btn_why_this_ad);
                viewFindViewById2.setVisibility(0);
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f71090a.f71092b);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f71090a.f71093c)) {
                final View viewFindViewById3 = findViewById(R.id.inter_option_btn_copy_ru_ad_marker);
                if (viewFindViewById3 != null) {
                    TextView textView = (TextView) viewFindViewById3.findViewById(R.id.inter_option_text_copy_ru_ad_marker);
                    if (textView != null) {
                        textView.setText(sg.bigo.ads.common.utils.a.a(getContext(), R.string.bigo_ad_feedback_copy_ad_id, e.this.f71090a.f71093c));
                    }
                    viewFindViewById3.setVisibility(0);
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (sg.bigo.ads.common.utils.c.g(viewFindViewById3.getContext(), e.this.f71090a.f71093c)) {
                                Toast.makeText(viewFindViewById3.getContext(), sg.bigo.ads.common.utils.a.a(viewFindViewById3.getContext(), R.string.bigo_ad_feedback_copied, new Object[0]), 0).show();
                            }
                            b.this.dismiss();
                        }
                    });
                }
                if (viewFindViewById3 != null && (viewFindViewById = viewFindViewById3.findViewById(R.id.inter_option_line)) != null) {
                    viewFindViewById.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(e.this.f71090a.f71094d)) {
                findViewById(R.id.inter_option_ll_ad_info).setVisibility(0);
                ((TextView) findViewById(R.id.inter_option_tv_ad_info)).setText(e.this.f71090a.f71094d);
            }
            if (!TextUtils.isEmpty(e.this.f71090a.f71095e)) {
                View viewFindViewById4 = findViewById(R.id.bigo_ad_btn_ad_copy_link);
                viewFindViewById4.setVisibility(0);
                final Context context = viewFindViewById4.getContext();
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (sg.bigo.ads.common.utils.c.g(context, e.this.f71090a.f71095e)) {
                            Context context2 = context;
                            Toast.makeText(context2, sg.bigo.ads.common.utils.a.a(context2, R.string.bigo_ad_feedback_link_copied, new Object[0]), 0).show();
                        }
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f71090a.f71096f)) {
                View viewFindViewById5 = findViewById(R.id.bigo_ad_btn_rec_rule);
                viewFindViewById5.setVisibility(0);
                viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f71090a.f71096f);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f71090a.f71097g)) {
                View viewFindViewById6 = findViewById(R.id.bigo_ad_btn_user_privacy);
                viewFindViewById6.setVisibility(0);
                viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f71090a.f71097g);
                        b.this.dismiss();
                    }
                });
            }
            viewA.findViewById(R.id.bigo_ad_feedback_background).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.dismiss();
                }
            });
        }
    }

    private e(@NonNull a aVar) {
        this.f71090a = aVar;
    }

    public /* synthetic */ e(a aVar, byte b10) {
        this(aVar);
    }

    public static /* synthetic */ void a(Window window) {
        if (window != null) {
            s.a(window);
        }
    }

    public static /* synthetic */ boolean a() {
        f71089b = false;
        return false;
    }
}
