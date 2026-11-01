package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.ironsource.C3426d4;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.netbean.UploadFileEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.o;
import em.p;
import em.r;
import ii.u;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Pattern;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import sa.o0;
import w9.l;
import x9.m;

/* JADX INFO: loaded from: classes11.dex */
public class EDITMINEVIEWMODEL extends ToolbarViewModel<n9.a> {
    public ul.b A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f41152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f41153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f41154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f41156s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f41157t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableField<String> f41158u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<String> f41159v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ObservableField<String> f41160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f41161x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f41162y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ul.b f41163z;

    public class a implements u<BaseResponse<UploadFileEntry>> {
        public a() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            EDITMINEVIEWMODEL.this.f41162y = false;
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            EDITMINEVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UploadFileEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                EDITMINEVIEWMODEL editmineviewmodel = EDITMINEVIEWMODEL.this;
                editmineviewmodel.f41162y = false;
                editmineviewmodel.f41161x = baseResponse.getResult().getFile_name();
                p.b(r.a().getResources().getString(R.string.str_success));
            }
        }
    }

    public class b implements u<BaseResponse<MineUserInfo>> {
        public b() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            EDITMINEVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                p.b(baseResponse.getMessage());
                if (baseResponse.getResult() != null) {
                    o0.c1(baseResponse.getResult().getHead_img());
                    o0.g1(baseResponse.getResult().getNickname());
                    tl.a.a().b(new m(baseResponse.getResult()));
                    EDITMINEVIEWMODEL.this.d();
                }
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            EDITMINEVIEWMODEL.this.c();
            p.b(r.a().getResources().getString(R.string.str_save_fail));
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            EDITMINEVIEWMODEL.this.b(bVar);
        }
    }

    public class c implements u<BaseResponse<MineUserInfo>> {
        public c() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            EDITMINEVIEWMODEL.this.c();
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            if (baseResponse.getResult().getSex() == 1) {
                EDITMINEVIEWMODEL.this.f41156s.set(r.a().getResources().getString(R.string.str_man));
            } else if (baseResponse.getResult().getSex() == 0) {
                EDITMINEVIEWMODEL.this.f41156s.set(r.a().getResources().getString(R.string.str_women));
            } else {
                EDITMINEVIEWMODEL.this.f41156s.set(r.a().getResources().getString(R.string.str_secrecy));
            }
            if (!o.b(baseResponse.getResult().getNickname())) {
                EDITMINEVIEWMODEL.this.f41157t.set(baseResponse.getResult().getNickname());
            }
            if (!o.b(baseResponse.getResult().getPhone())) {
                EDITMINEVIEWMODEL.this.f41158u.set(baseResponse.getResult().getPhone());
            }
            if (!o.b(baseResponse.getResult().getHead_img())) {
                EDITMINEVIEWMODEL.this.f41159v.set(baseResponse.getResult().getHead_img());
            }
            if (o.b(baseResponse.getResult().getIntro())) {
                return;
            }
            EDITMINEVIEWMODEL.this.f41160w.set(baseResponse.getResult().getIntro());
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            EDITMINEVIEWMODEL.this.c();
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            EDITMINEVIEWMODEL.this.b(bVar);
        }
    }

    public void w(File file) {
        this.f41162y = true;
        ((n9.a) this.f64407b).z(MultipartBody.Part.createFormData(C3426d4.i.f28530b, file.getName(), RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file))).e(new l()).e(new w9.c()).b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f41152o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f41153p.call();
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        this.f41154q.call();
    }

    public void p(String str, String str2, String str3) {
        if (this.f41162y) {
            p.b(r.a().getResources().getString(R.string.str_header_uping));
            return;
        }
        int i10 = 0;
        if (!o.b(this.f41156s.get())) {
            if (this.f41156s.get().equals(r.a().getResources().getString(R.string.str_man))) {
                i10 = 1;
            } else if (!this.f41156s.get().equals(r.a().getResources().getString(R.string.str_women))) {
                i10 = 2;
            }
        }
        if (o.b(str)) {
            p.b(r.a().getResources().getString(R.string.str_nickname_write));
            return;
        }
        if (!o.b(str2) && !t("^((13[0-9])|(15[^4])|(18[0-9])|(17[0-8])|(147,145))\\d{8}$", str2)) {
            p.b("手机号格式不对");
            return;
        }
        j();
        HashMap map = new HashMap();
        map.put("nickname", str);
        map.put("sex", Integer.valueOf(i10));
        map.put("head_img", this.f41161x);
        if (o.b(str3)) {
            str3 = "";
        }
        map.put("intro", str3);
        ((n9.a) this.f64407b).S(map).e(new l()).e(new w9.c()).b(new b());
    }

    public EDITMINEVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41152o = new SingleLiveEvent<>();
        this.f41153p = new SingleLiveEvent<>();
        this.f41154q = new SingleLiveEvent<>();
        this.f41155r = new ObservableField<>();
        this.f41156s = new ObservableField<>("");
        this.f41157t = new ObservableField<>();
        this.f41158u = new ObservableField<>();
        this.f41159v = new ObservableField<>();
        this.f41160w = new ObservableField<>();
        this.f41161x = "";
        this.f41162y = false;
        this.f41163z = new ul.b(new ul.a() { // from class: w9.w
            @Override // ul.a
            public final void call() {
                this.f73834a.u();
            }
        });
        this.A = new ul.b(new ul.a() { // from class: w9.x
            @Override // ul.a
            public final void call() {
                this.f73849a.v();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.str_edit_info));
        this.f42196i.set(true);
        this.f42195h.set(r.a().getResources().getString(R.string.str_save));
    }

    public static boolean t(String str, CharSequence charSequence) {
        if (Pattern.compile(str).matcher(charSequence).find()) {
            return true;
        }
        return false;
    }

    public void x() {
        j();
        ((n9.a) this.f64407b).c(new HashMap()).e(new l()).e(new w9.c()).b(new c());
    }
}
