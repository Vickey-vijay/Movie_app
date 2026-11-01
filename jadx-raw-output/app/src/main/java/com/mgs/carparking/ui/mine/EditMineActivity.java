package com.mgs.carparking.ui.mine;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.luck.picture.lib.entity.LocalMedia;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityEditMineBinding;
import com.mgs.carparking.model.EDITMINEVIEWMODEL;
import com.tbruyelle.rxpermissions2.RxPermissions;
import em.n;
import em.r;
import ib.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import oi.g;
import sa.s;
import x9.p;

/* JADX INFO: loaded from: classes7.dex */
public class EditMineActivity extends BaseActivity<ActivityEditMineBinding, EDITMINEVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gb.a f42066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gb.b f42067i;

    public class a implements gb.a.d {
        public a() {
        }

        @Override // gb.a.d
        public void a(int i10) {
            EditMineActivity.this.camera(i10);
        }
    }

    public class b implements gb.b.f {
        @Override // gb.b.f
        public void a(int i10) {
            if (i10 == 1) {
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f39698d).f41156s.set(r.a().getResources().getString(R.string.str_man));
            } else if (i10 == 2) {
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f39698d).f41156s.set(r.a().getResources().getString(R.string.str_women));
            } else if (i10 == 3) {
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f39698d).f41156s.set(r.a().getResources().getString(R.string.str_secrecy));
            }
        }

        public b() {
        }
    }

    public class c implements ib.c {
        public c() {
        }

        @Override // ib.c
        public void a(List<LocalMedia> list, int i10) {
            String strG;
            if (!h9.b.a(list) && (strG = e.g(0, list)) != null) {
                ((ActivityEditMineBinding) EditMineActivity.this.f39697c).f39788f.setImageURI(Uri.parse(strG));
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f39698d).w(new File(strG));
            }
        }
    }

    public class d implements ib.c {
        public d() {
        }

        @Override // ib.c
        public void a(List<LocalMedia> list, int i10) {
            String strG;
            if (!h9.b.a(list) && (strG = e.g(0, list)) != null) {
                ((ActivityEditMineBinding) EditMineActivity.this.f39697c).f39788f.setImageURI(Uri.parse(strG));
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f39698d).w(new File(strG));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @RequiresApi(api = 26)
    public static String fileToBase64(File file) throws Throwable {
        FileInputStream fileInputStream;
        String strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        strEncodeToString = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        strEncodeToString = Base64.getEncoder().encodeToString(bArr);
                        fileInputStream.close();
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (IOException unused) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return strEncodeToString;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
                fileInputStream = null;
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        return strEncodeToString;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_edit_mine;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Void r10) {
        ((EDITMINEVIEWMODEL) this.f39698d).p(((ActivityEditMineBinding) this.f39697c).f39785c.getText().toString(), ((ActivityEditMineBinding) this.f39697c).f39787e.getText().toString(), ((ActivityEditMineBinding) this.f39697c).f39786d.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(p pVar) throws Exception {
        ((EDITMINEVIEWMODEL) this.f39698d).f41159v.set(pVar.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public EDITMINEVIEWMODEL initViewModel() {
        return new EDITMINEVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(int i10, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            if (i10 == 1) {
                z();
            } else if (i10 == 2) {
                A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Void r10) {
        s.b().a(this);
        if (this.f42066h == null) {
            this.f42066h = new gb.a(this);
        }
        this.f42066h.showAtLocation(((ActivityEditMineBinding) this.f39697c).f39789g, 80, 0, 0);
        this.f42066h.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Void r10) {
        s.b().a(this);
        if (this.f42067i == null) {
            this.f42067i = new gb.b(this, ((EDITMINEVIEWMODEL) this.f39698d).f41156s.get());
        }
        this.f42067i.showAtLocation(((ActivityEditMineBinding) this.f39697c).f39789g, 80, 0, 0);
        this.f42067i.d(new b());
    }

    public final void A() {
        e.c().i(this, new c());
    }

    public void camera(final int i10) {
        String[] strArrA = l8.b.a(a8.e.c());
        int length = strArrA.length + 1;
        String[] strArr = new String[length];
        System.arraycopy(strArrA, 0, strArr, 0, strArrA.length);
        strArr[length - 1] = "android.permission.CAMERA";
        k(new RxPermissions(this).request(strArr).subscribe(new g() { // from class: ka.o
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62728b.B(i10, (Boolean) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((ActivityEditMineBinding) this.f39697c).f39784b.f39734g.setTextColor(getResources().getColor(R.color.color_42BD56));
        ((EDITMINEVIEWMODEL) this.f39698d).x();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((EDITMINEVIEWMODEL) this.f39698d).f41152o.observe(this, new Observer() { // from class: ka.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62724b.C((Void) obj);
            }
        });
        ((EDITMINEVIEWMODEL) this.f39698d).f41153p.observe(this, new Observer() { // from class: ka.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62725b.D((Void) obj);
            }
        });
        ((EDITMINEVIEWMODEL) this.f39698d).f41154q.observe(this, new Observer() { // from class: ka.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62726b.E((Void) obj);
            }
        });
        k(tl.a.a().d(p.class).subscribe(new g() { // from class: ka.n
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62727b.F((x9.p) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f42066h != null) {
            this.f42066h = null;
        }
        if (this.f42067i != null) {
            this.f42067i = null;
        }
    }

    public final void z() {
        e.c().h(this, new d());
    }
}
