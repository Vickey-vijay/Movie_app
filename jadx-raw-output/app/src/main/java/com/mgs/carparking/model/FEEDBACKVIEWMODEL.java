package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.ironsource.C3426d4;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.mgs.carparking.netbean.FeedbackTypeEntry;
import com.mgs.carparking.netbean.UploadFileEntry;
import com.mgs.carparking.ui.mine.feedback.FeedbackRecordActivity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.o;
import em.p;
import em.r;
import fm.d;
import ii.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import sa.o0;
import w9.l;
import w9.q1;

/* JADX INFO: loaded from: classes11.dex */
public class FEEDBACKVIEWMODEL extends ToolbarViewModel<n9.a> {
    public ul.b A;
    public ul.b B;
    public ul.b C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f41191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f41192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f41193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Void> f41194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<Boolean> f41195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<SpannableStringBuilder> f41196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<String> f41197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f41199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ObservableList<q1> f41200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public fm.c<q1> f41201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ul.b f41202z;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#365899"));
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (o.b(o0.Z())) {
                FEEDBACKVIEWMODEL.this.f41197u.setValue("http://dg10.tv");
            } else {
                FEEDBACKVIEWMODEL.this.f41197u.setValue(o0.Z());
            }
        }
    }

    public class b implements u<BaseResponse<UploadFileEntry>> {
        public b() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            FEEDBACKVIEWMODEL.this.f41198v = false;
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            FEEDBACKVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UploadFileEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                FEEDBACKVIEWMODEL feedbackviewmodel = FEEDBACKVIEWMODEL.this;
                feedbackviewmodel.f41198v = false;
                feedbackviewmodel.f41199w = baseResponse.getResult().getFile_name();
                p.b(r.a().getResources().getString(R.string.str_success));
            }
        }
    }

    public class c implements u<BaseResponse<String>> {
        public c() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            FEEDBACKVIEWMODEL.this.c();
            p.b(baseResponse.getMessage());
            FEEDBACKVIEWMODEL.this.d();
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            FEEDBACKVIEWMODEL.this.c();
            p.b(r.a().getResources().getString(R.string.str_fail));
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            FEEDBACKVIEWMODEL.this.b(bVar);
        }
    }

    public static /* synthetic */ void y() {
    }

    public void z(File file) {
        this.f41198v = true;
        ((n9.a) this.f64407b).z(MultipartBody.Part.createFormData(C3426d4.i.f28530b, file.getName(), RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file))).e(new l()).e(new w9.c()).b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f41194r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f41195s.set(Boolean.FALSE);
        this.f41199w = "";
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v() {
        if (o.b(this.f41192p.get().trim())) {
            p.b(r.a().getResources().getString(R.string.str_write_content));
            return;
        }
        if (this.f41198v) {
            p.b(r.a().getResources().getString(R.string.str_pic_uping));
            return;
        }
        String name = "";
        for (int i10 = 0; i10 < this.f41200x.size(); i10++) {
            if (this.f41200x.get(i10).f73757e.get().booleanValue()) {
                name = this.f41200x.get(i10).f73756d.getName();
            }
        }
        j();
        HashMap map = new HashMap();
        map.put("type", 1);
        map.put("content", this.f41192p.get());
        map.put("tags", name);
        map.put("imgs", this.f41199w);
        ((n9.a) this.f64407b).t(map).e(new l()).e(new w9.c()).b(new c());
    }

    public void getType(int i10) {
        List arrayList = new ArrayList();
        if (!o.b(o0.w())) {
            arrayList = Arrays.asList(o0.w().split(StringUtils.COMMA));
        }
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 1) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 == 1) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i11), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i11), false));
                    }
                }
            } else if (i10 == 2) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 == 2) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i12), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i12), false));
                    }
                }
            } else if (i10 == 3) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 == 3) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i13), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i13), false));
                    }
                }
            } else if (i10 == 0) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 == 0) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i14), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i14), false));
                    }
                }
            }
            this.f41200x.clear();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                this.f41200x.add(new q1(this, (FeedbackTypeEntry) arrayList2.get(i15), this.f41200x, i15));
            }
        }
    }

    public FEEDBACKVIEWMODEL(@NonNull Application application, n9.a aVar) {
        String str;
        super(application, aVar);
        this.f41191o = new ObservableField<>("0/200");
        this.f41192p = new ObservableField<>("");
        Boolean bool = Boolean.FALSE;
        this.f41193q = new ObservableField<>(bool);
        this.f41194r = new SingleLiveEvent<>();
        this.f41195s = new ObservableField<>(bool);
        this.f41196t = new ObservableField<>();
        this.f41197u = new SingleLiveEvent<>();
        this.f41198v = false;
        this.f41199w = "";
        this.f41200x = new ObservableArrayList();
        this.f41201y = fm.c.d(new d() { // from class: w9.c0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_feedback_type_new);
            }
        });
        this.f41202z = new ul.b(new ul.a() { // from class: w9.d0
            @Override // ul.a
            public final void call() {
                this.f73593a.v();
            }
        });
        this.A = new ul.b(new ul.a() { // from class: w9.e0
            @Override // ul.a
            public final void call() {
                this.f73605a.w();
            }
        });
        this.B = new ul.b(new ul.a() { // from class: w9.f0
            @Override // ul.a
            public final void call() {
                this.f73613a.x();
            }
        });
        this.C = new ul.b(new ul.a() { // from class: w9.g0
            @Override // ul.a
            public final void call() {
                FEEDBACKVIEWMODEL.y();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.text_mine_feedback));
        this.f42196i.set(true);
        this.f42195h.set(r.a().getResources().getString(R.string.str_feedback_histroy));
        if (!o.b(o0.Z())) {
            str = "如遇无法播放、闪退等问题，请点击: " + o0.Z() + " 下载最新版本。";
        } else {
            str = "如遇无法播放、闪退等问题，请点击: http://dg10.tv 下载最新版本。";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new a(), 17, str.length() - 8, 33);
        this.f41196t.set(spannableStringBuilder);
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        super.m();
        startActivity(FeedbackRecordActivity.class);
    }
}
