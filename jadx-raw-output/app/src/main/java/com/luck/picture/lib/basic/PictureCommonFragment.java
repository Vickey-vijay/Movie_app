package com.luck.picture.lib.basic;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$raw;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.dialog.PhotoItemSelectedDialog;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.service.ForegroundService;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.safedk.android.utils.Logger;
import f8.a0;
import f8.b0;
import f8.d0;
import f8.e0;
import f8.w;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o8.p;
import o8.r;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class PictureCommonFragment extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f32141m = PictureCommonFragment.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l8.c f32142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.luck.picture.lib.basic.a f32143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32144d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h8.a f32145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PictureSelectionConfig f32146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dialog f32147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SoundPool f32148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Dialog f32151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f32152l;

    public class a implements f8.d<ArrayList<LocalMedia>> {
        public a() {
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ArrayList<LocalMedia> arrayList) {
            PictureCommonFragment.this.o0(arrayList);
        }
    }

    public class b implements f8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f32154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32155b;

        public b(ConcurrentHashMap concurrentHashMap, ArrayList arrayList) {
            this.f32154a = concurrentHashMap;
            this.f32155b = arrayList;
        }

        @Override // f8.l
        public void a(String str, String str2) {
            LocalMedia localMedia = (LocalMedia) this.f32154a.get(str);
            if (localMedia != null) {
                localMedia.u0(str2);
                this.f32154a.remove(str);
            }
            if (this.f32154a.size() == 0) {
                PictureCommonFragment.this.Y(this.f32155b);
            }
        }
    }

    public class c implements f8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f32158b;

        public c(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
            this.f32157a = arrayList;
            this.f32158b = concurrentHashMap;
        }

        @Override // f8.l
        public void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                PictureCommonFragment.this.J(this.f32157a);
                return;
            }
            LocalMedia localMedia = (LocalMedia) this.f32158b.get(str);
            if (localMedia != null) {
                localMedia.v0(str2);
                this.f32158b.remove(str);
            }
            if (this.f32158b.size() == 0) {
                PictureCommonFragment.this.J(this.f32157a);
            }
        }
    }

    public class d extends PictureThreadUtils.d<ArrayList<LocalMedia>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f32160i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32161j;

        public class a implements f8.l {
            public a() {
            }

            @Override // f8.l
            public void a(String str, String str2) {
                LocalMedia localMedia;
                if (!TextUtils.isEmpty(str) && (localMedia = (LocalMedia) d.this.f32160i.get(str)) != null) {
                    if (TextUtils.isEmpty(localMedia.z())) {
                        localMedia.s0(str2);
                    }
                    if (PictureCommonFragment.this.f32146f.T) {
                        localMedia.n0(str2);
                        localMedia.m0(!TextUtils.isEmpty(str2));
                    }
                    d.this.f32160i.remove(str);
                }
            }
        }

        public d(ConcurrentHashMap concurrentHashMap, ArrayList arrayList) {
            this.f32160i = concurrentHashMap;
            this.f32161j = arrayList;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public ArrayList<LocalMedia> g() {
            Iterator it = this.f32160i.entrySet().iterator();
            while (it.hasNext()) {
                LocalMedia localMedia = (LocalMedia) ((Map.Entry) it.next()).getValue();
                if (PictureCommonFragment.this.f32146f.T || TextUtils.isEmpty(localMedia.z())) {
                    PictureSelectionConfig.Q0.a(PictureCommonFragment.this.K(), localMedia.w(), localMedia.s(), new a());
                }
            }
            return this.f32161j;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(ArrayList<LocalMedia> arrayList) {
            PictureThreadUtils.d(this);
            PictureCommonFragment.this.I(arrayList);
        }
    }

    public class e extends PictureThreadUtils.d<ArrayList<LocalMedia>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32164i;

        public class a implements f8.c<LocalMedia> {
            public a() {
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public ArrayList<LocalMedia> g() {
            for (int i10 = 0; i10 < this.f32164i.size(); i10++) {
                int i11 = i10;
                PictureSelectionConfig.P0.a(PictureCommonFragment.this.K(), PictureCommonFragment.this.f32146f.T, i11, (LocalMedia) this.f32164i.get(i10), new a());
            }
            return this.f32164i;
        }

        public e(ArrayList arrayList) {
            this.f32164i = arrayList;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(ArrayList<LocalMedia> arrayList) {
            PictureThreadUtils.d(this);
            PictureCommonFragment.this.I(arrayList);
        }
    }

    public class f implements f8.d<Boolean> {
        public f() {
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                PictureCommonFragment.this.R(l8.b.f63496a);
            }
        }
    }

    public class g implements View.OnKeyListener {
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            PictureCommonFragment.this.j0();
            return true;
        }

        public g() {
        }
    }

    public class h implements f8.k {
        @Override // f8.k
        public void a(View view, int i10) {
            if (i10 == 0) {
                if (PictureSelectionConfig.U0 != null) {
                    PictureCommonFragment.this.i0(1);
                    return;
                } else {
                    PictureCommonFragment.this.t0();
                    return;
                }
            }
            if (i10 != 1) {
                return;
            }
            if (PictureSelectionConfig.U0 != null) {
                PictureCommonFragment.this.i0(2);
            } else {
                PictureCommonFragment.this.w0();
            }
        }

        public h() {
        }
    }

    public class i implements PhotoItemSelectedDialog.a {
        public i() {
        }

        @Override // com.luck.picture.lib.dialog.PhotoItemSelectedDialog.a
        public void a(boolean z10, DialogInterface dialogInterface) {
            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
            if (pictureCommonFragment.f32146f.f32202c && z10) {
                pictureCommonFragment.j0();
            }
        }
    }

    public class j implements l8.c {
        public j() {
        }

        @Override // l8.c
        public void a() {
            PictureCommonFragment.this.Q(l8.b.f63497b);
        }

        @Override // l8.c
        public void onGranted() {
            PictureCommonFragment.this.K0();
        }
    }

    public class k implements l8.c {
        public k() {
        }

        @Override // l8.c
        public void a() {
            PictureCommonFragment.this.Q(l8.b.f63497b);
        }

        @Override // l8.c
        public void onGranted() {
            PictureCommonFragment.this.L0();
        }
    }

    public class l implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32173a;

        public l(int i10) {
            this.f32173a = i10;
        }
    }

    public class m extends PictureThreadUtils.d<LocalMedia> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Intent f32175i;

        public m(Intent intent) {
            this.f32175i = intent;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public LocalMedia g() {
            String strM = PictureCommonFragment.this.M(this.f32175i);
            if (!TextUtils.isEmpty(strM)) {
                PictureCommonFragment.this.f32146f.f32201b0 = strM;
            }
            if (TextUtils.isEmpty(PictureCommonFragment.this.f32146f.f32201b0)) {
                return null;
            }
            if (PictureCommonFragment.this.f32146f.f32200b == a8.e.b()) {
                PictureCommonFragment.this.w();
            }
            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
            return pictureCommonFragment.i(pictureCommonFragment.f32146f.f32201b0);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(LocalMedia localMedia) {
            PictureThreadUtils.d(this);
            if (localMedia != null) {
                PictureCommonFragment.this.p0(localMedia);
                PictureCommonFragment.this.F(localMedia);
            }
        }
    }

    public class n implements f8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f32178b;

        public n(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
            this.f32177a = arrayList;
            this.f32178b = concurrentHashMap;
        }

        @Override // f8.l
        public void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                PictureCommonFragment.this.o0(this.f32177a);
                return;
            }
            LocalMedia localMedia = (LocalMedia) this.f32178b.get(str);
            if (localMedia != null) {
                if (o8.l.e()) {
                    if (!TextUtils.isEmpty(str2) && (str2.contains("Android/data/") || str2.contains("data/user/"))) {
                        localMedia.S(str2);
                        localMedia.T(!TextUtils.isEmpty(str2));
                        localMedia.s0(localMedia.i());
                    }
                } else {
                    localMedia.S(str2);
                    localMedia.T(!TextUtils.isEmpty(str2));
                }
                this.f32178b.remove(str);
            }
            if (this.f32178b.size() == 0) {
                PictureCommonFragment.this.o0(this.f32177a);
            }
        }
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public void F(LocalMedia localMedia) {
    }

    public void G0(View view) {
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new g());
    }

    public String M(Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri data = (Uri) intent.getParcelableExtra("output");
        if (this.f32146f.f32200b == a8.e.b() && data == null) {
            data = intent.getData();
        }
        if (data == null) {
            return null;
        }
        return a8.d.c(data.toString()) ? data.toString() : data.getPath();
    }

    public int N() {
        return 0;
    }

    public void R(String[] strArr) {
    }

    public void Z() {
    }

    public void c0(Intent intent) {
    }

    public void d0() {
    }

    public void e0() {
    }

    public void g0(LocalMedia localMedia) {
    }

    public void h0() {
    }

    public void l0(ArrayList<LocalMedia> arrayList) {
        LocalMedia localMedia;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            localMedia = arrayList.get(i10);
            if (a8.d.h(arrayList.get(i10).s())) {
                PictureSelectionConfig.N0.a(this, localMedia, arrayList, 69);
            }
        }
        localMedia = null;
        PictureSelectionConfig.N0.a(this, localMedia, arrayList, 69);
    }

    public void r0(boolean z10, LocalMedia localMedia) {
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    public boolean t(LocalMedia localMedia, boolean z10, String str, int i10, long j10, long j11) {
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        long j12 = pictureSelectionConfig.A;
        if (j12 > 0 && j10 > j12) {
            e0 e0Var = PictureSelectionConfig.V0;
            if (e0Var != null && e0Var.a(K(), localMedia, this.f32146f, 1)) {
                return true;
            }
            J0(getString(R$string.ps_select_max_size, o8.k.f(this.f32146f.A)));
            return true;
        }
        long j13 = pictureSelectionConfig.B;
        if (j13 > 0 && j10 < j13) {
            e0 e0Var2 = PictureSelectionConfig.V0;
            if (e0Var2 != null && e0Var2.a(K(), localMedia, this.f32146f, 2)) {
                return true;
            }
            J0(getString(R$string.ps_select_min_size, o8.k.f(this.f32146f.B)));
            return true;
        }
        if (a8.d.i(str)) {
            PictureSelectionConfig pictureSelectionConfig2 = this.f32146f;
            if (pictureSelectionConfig2.f32218k == 2) {
                if (pictureSelectionConfig2.f32224n <= 0) {
                    e0 e0Var3 = PictureSelectionConfig.V0;
                    if (e0Var3 != null && e0Var3.a(K(), localMedia, this.f32146f, 3)) {
                        return true;
                    }
                    J0(getString(R$string.ps_rule));
                    return true;
                }
                if (!z10 && j8.a.n().size() >= this.f32146f.f32220l) {
                    e0 e0Var4 = PictureSelectionConfig.V0;
                    if (e0Var4 != null && e0Var4.a(K(), localMedia, this.f32146f, 4)) {
                        return true;
                    }
                    J0(getString(R$string.ps_message_max_num, Integer.valueOf(this.f32146f.f32220l)));
                    return true;
                }
                if (!z10 && i10 >= this.f32146f.f32224n) {
                    e0 e0Var5 = PictureSelectionConfig.V0;
                    if (e0Var5 != null && e0Var5.a(K(), localMedia, this.f32146f, 6)) {
                        return true;
                    }
                    J0(P(K(), str, this.f32146f.f32224n));
                    return true;
                }
            }
            if (!z10 && this.f32146f.f32238u > 0 && o8.d.i(j11) < this.f32146f.f32238u) {
                e0 e0Var6 = PictureSelectionConfig.V0;
                if (e0Var6 != null && e0Var6.a(K(), localMedia, this.f32146f, 9)) {
                    return true;
                }
                J0(getString(R$string.ps_select_video_min_second, Integer.valueOf(this.f32146f.f32238u / 1000)));
                return true;
            }
            if (!z10 && this.f32146f.f32236t > 0 && o8.d.i(j11) > this.f32146f.f32236t) {
                e0 e0Var7 = PictureSelectionConfig.V0;
                if (e0Var7 != null && e0Var7.a(K(), localMedia, this.f32146f, 8)) {
                    return true;
                }
                J0(getString(R$string.ps_select_video_max_second, Integer.valueOf(this.f32146f.f32236t / 1000)));
                return true;
            }
        } else if (this.f32146f.f32218k == 2 && !z10 && j8.a.n().size() >= this.f32146f.f32220l) {
            e0 e0Var8 = PictureSelectionConfig.V0;
            if (e0Var8 != null && e0Var8.a(K(), localMedia, this.f32146f, 4)) {
                return true;
            }
            J0(getString(R$string.ps_message_max_num, Integer.valueOf(this.f32146f.f32220l)));
            return true;
        }
        return false;
    }

    public void z0(boolean z10) {
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f32181b;

        public o(int i10, Intent intent) {
            this.f32180a = i10;
            this.f32181b = intent;
        }
    }

    public final void D() {
        c8.h hVarA;
        if (PictureSelectionConfig.S0 != null || (hVarA = y7.b.c().a()) == null) {
            return;
        }
        PictureSelectionConfig.S0 = hVarA.e();
    }

    public void D0(long j10) {
        this.f32150j = j10;
    }

    public void E0(l8.c cVar) {
        this.f32142b = cVar;
    }

    public final void G(Intent intent) {
        PictureThreadUtils.h(new m(intent));
    }

    public final void H0() {
        if (this.f32146f.L) {
            e8.a.c(requireActivity(), PictureSelectionConfig.T0.c().U());
        }
    }

    public long L() {
        long j10 = this.f32150j;
        if (j10 > 50) {
            j10 -= 50;
        }
        if (j10 >= 0) {
            return j10;
        }
        return 0L;
    }

    public final void N0(ArrayList<LocalMedia> arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            String strF = localMedia.f();
            if (a8.d.i(localMedia.s()) || a8.d.o(strF)) {
                concurrentHashMap.put(strF, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            Y(arrayList);
            return;
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            PictureSelectionConfig.f32191j1.a(K(), (String) ((Map.Entry) it.next()).getKey(), new b(concurrentHashMap, arrayList));
        }
    }

    public o O(int i10, ArrayList<LocalMedia> arrayList) {
        return new o(i10, arrayList != null ? z7.j.d(arrayList) : null);
    }

    public void Q(String[] strArr) {
        l8.b.f63496a = strArr;
        if (strArr != null && strArr.length > 0) {
            p.c(K(), strArr[0], true);
        }
        if (PictureSelectionConfig.f32187f1 == null) {
            l8.d.a(this, 1102);
        } else {
            m0(false, null);
            PictureSelectionConfig.f32187f1.a(this, strArr, 1102, new f());
        }
    }

    public final void V(ArrayList<LocalMedia> arrayList) {
        if (this.f32146f.T) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia = arrayList.get(i10);
                localMedia.m0(true);
                localMedia.n0(localMedia.w());
            }
        }
    }

    public void W(int i10, String[] strArr) {
        PictureSelectionConfig.f32182a1.b(this, strArr, new l(i10));
    }

    public void b0(ArrayList<LocalMedia> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Uri uriFromFile = null;
        Uri uriFromFile2 = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            arrayList2.add(localMedia.f());
            if (uriFromFile == null && a8.d.h(localMedia.s())) {
                String strF = localMedia.f();
                uriFromFile = (a8.d.c(strF) || a8.d.g(strF)) ? Uri.parse(strF) : Uri.fromFile(new File(strF));
                uriFromFile2 = Uri.fromFile(new File(new File(o8.h.b(K(), 1)).getAbsolutePath(), o8.d.c("CROP_") + ".jpg"));
            }
        }
        PictureSelectionConfig.O0.a(this, uriFromFile, uriFromFile2, arrayList2, 69);
    }

    public final void h(ArrayList<LocalMedia> arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            if (!a8.d.d(localMedia.s())) {
                concurrentHashMap.put(localMedia.f(), localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            J(arrayList);
            return;
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            PictureSelectionConfig.f32190i1.a(K(), (String) entry.getKey(), ((LocalMedia) entry.getValue()).s(), new c(arrayList, concurrentHashMap));
        }
    }

    public boolean j() {
        return PictureSelectionConfig.f32190i1 != null;
    }

    public final boolean k() {
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.f32218k == 2 && !pictureSelectionConfig.f32202c) {
            if (pictureSelectionConfig.Q) {
                ArrayList<LocalMedia> arrayListN = j8.a.n();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < arrayListN.size(); i12++) {
                    if (a8.d.i(arrayListN.get(i12).s())) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
                PictureSelectionConfig pictureSelectionConfig2 = this.f32146f;
                int i13 = pictureSelectionConfig2.f32222m;
                if (i13 > 0 && i10 < i13) {
                    e0 e0Var = PictureSelectionConfig.V0;
                    if (e0Var != null && e0Var.a(K(), null, this.f32146f, 5)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_img_num, String.valueOf(this.f32146f.f32222m)));
                    return true;
                }
                int i14 = pictureSelectionConfig2.f32226o;
                if (i14 > 0 && i11 < i14) {
                    e0 e0Var2 = PictureSelectionConfig.V0;
                    if (e0Var2 != null && e0Var2.a(K(), null, this.f32146f, 7)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_video_num, String.valueOf(this.f32146f.f32226o)));
                    return true;
                }
            } else {
                String strO = j8.a.o();
                if (a8.d.h(strO) && this.f32146f.f32222m > 0 && j8.a.l() < this.f32146f.f32222m) {
                    e0 e0Var3 = PictureSelectionConfig.V0;
                    if (e0Var3 != null && e0Var3.a(K(), null, this.f32146f, 5)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_img_num, String.valueOf(this.f32146f.f32222m)));
                    return true;
                }
                if (a8.d.i(strO) && this.f32146f.f32226o > 0 && j8.a.l() < this.f32146f.f32226o) {
                    e0 e0Var4 = PictureSelectionConfig.V0;
                    if (e0Var4 != null && e0Var4.a(K(), null, this.f32146f, 7)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_video_num, String.valueOf(this.f32146f.f32226o)));
                    return true;
                }
                if (a8.d.d(strO) && this.f32146f.f32228p > 0 && j8.a.l() < this.f32146f.f32228p) {
                    e0 e0Var5 = PictureSelectionConfig.V0;
                    if (e0Var5 != null && e0Var5.a(K(), null, this.f32146f, 12)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_audio_num, String.valueOf(this.f32146f.f32228p)));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean l() {
        if (PictureSelectionConfig.M0 != null) {
            for (int i10 = 0; i10 < j8.a.l(); i10++) {
                if (a8.d.h(j8.a.n().get(i10).s())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m() {
        if (PictureSelectionConfig.O0 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.f32146f.S;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (j8.a.l() == 1) {
            String strO = j8.a.o();
            boolean zH = a8.d.h(strO);
            if (zH && hashSet.contains(strO)) {
                return false;
            }
            return zH;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < j8.a.l(); i11++) {
            LocalMedia localMedia = j8.a.n().get(i11);
            if (a8.d.h(localMedia.s()) && hashSet.contains(localMedia.s())) {
                i10++;
            }
        }
        return i10 != j8.a.l();
    }

    public void m0(boolean z10, String[] strArr) {
        f8.o oVar = PictureSelectionConfig.f32186e1;
        if (oVar != null) {
            if (!z10) {
                oVar.a(this);
            } else if (l8.a.h(K(), strArr)) {
                p.c(K(), strArr[0], false);
            } else {
                if (p.a(K(), strArr[0], false)) {
                    return;
                }
                PictureSelectionConfig.f32186e1.b(this, strArr);
            }
        }
    }

    public boolean n() {
        if (PictureSelectionConfig.L0 != null) {
            for (int i10 = 0; i10 < j8.a.l(); i10++) {
                if (a8.d.h(j8.a.n().get(i10).s())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o() {
        if (PictureSelectionConfig.N0 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.f32146f.S;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (j8.a.l() == 1) {
            String strO = j8.a.o();
            boolean zH = a8.d.h(strO);
            if (zH && hashSet.contains(strO)) {
                return false;
            }
            return zH;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < j8.a.l(); i11++) {
            LocalMedia localMedia = j8.a.n().get(i11);
            if (a8.d.h(localMedia.s()) && hashSet.contains(localMedia.s())) {
                i10++;
            }
        }
        return i10 != j8.a.l();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        Animation animationLoadAnimation;
        PictureWindowAnimationStyle pictureWindowAnimationStyleE = PictureSelectionConfig.T0.e();
        if (z10) {
            animationLoadAnimation = pictureWindowAnimationStyleE.f32355b != 0 ? AnimationUtils.loadAnimation(K(), pictureWindowAnimationStyleE.f32355b) : AnimationUtils.loadAnimation(K(), R$anim.ps_anim_alpha_enter);
            D0(animationLoadAnimation.getDuration());
            d0();
        } else {
            animationLoadAnimation = pictureWindowAnimationStyleE.f32356c != 0 ? AnimationUtils.loadAnimation(K(), pictureWindowAnimationStyleE.f32356c) : AnimationUtils.loadAnimation(K(), R$anim.ps_anim_alpha_exit);
            e0();
        }
        return animationLoadAnimation;
    }

    public void q0(int i10, ArrayList<LocalMedia> arrayList) {
        if (this.f32143c != null) {
            this.f32143c.a(O(i10, arrayList));
        }
    }

    public boolean s() {
        return PictureSelectionConfig.f32191j1 != null;
    }

    public void t0() {
        String[] strArr = l8.b.f63497b;
        m0(true, strArr);
        if (PictureSelectionConfig.f32182a1 != null) {
            W(a8.c.f3504a, strArr);
        } else {
            l8.a.b().requestPermissions(this, strArr, new j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int u(LocalMedia localMedia, boolean z10) {
        d0 d0Var = PictureSelectionConfig.f32185d1;
        int i10 = 0;
        if (d0Var != null && d0Var.a(localMedia)) {
            e0 e0Var = PictureSelectionConfig.V0;
            if (!(e0Var != null ? e0Var.a(K(), localMedia, this.f32146f, 13) : false)) {
                r.c(K(), getString(R$string.ps_select_no_support));
            }
            return -1;
        }
        if (T(localMedia, z10) != 200) {
            return -1;
        }
        ArrayList<LocalMedia> arrayListN = j8.a.n();
        if (z10) {
            arrayListN.remove(localMedia);
            i10 = 1;
        } else {
            if (this.f32146f.f32218k == 1 && arrayListN.size() > 0) {
                A0(arrayListN.get(0));
                arrayListN.clear();
            }
            arrayListN.add(localMedia);
            localMedia.l0(arrayListN.size());
            x0();
        }
        B0(i10 ^ 1, localMedia);
        return i10;
    }

    public void u0() {
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        int i10 = pictureSelectionConfig.f32200b;
        if (i10 == 0) {
            if (pictureSelectionConfig.f32227o0 == a8.e.c()) {
                t0();
                return;
            } else if (this.f32146f.f32227o0 == a8.e.d()) {
                w0();
                return;
            } else {
                s0();
                return;
            }
        }
        if (i10 == 1) {
            t0();
        } else if (i10 == 2) {
            w0();
        } else {
            if (i10 != 3) {
                return;
            }
            v0();
        }
    }

    public void v0() {
        if (PictureSelectionConfig.f32188g1 != null) {
            ForegroundService.c(K());
            PictureSelectionConfig.f32188g1.a(this, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
        } else {
            throw new NullPointerException(w.class.getSimpleName() + " interface needs to be implemented for recording");
        }
    }

    public final void w() {
        String str;
        try {
            if (TextUtils.isEmpty(this.f32146f.Y) || !a8.d.c(this.f32146f.f32201b0)) {
                return;
            }
            InputStream inputStreamA = z7.e.a(K(), Uri.parse(this.f32146f.f32201b0));
            if (TextUtils.isEmpty(this.f32146f.W)) {
                str = "";
            } else {
                PictureSelectionConfig pictureSelectionConfig = this.f32146f;
                if (pictureSelectionConfig.f32202c) {
                    str = pictureSelectionConfig.W;
                } else {
                    str = System.currentTimeMillis() + "_" + this.f32146f.W;
                }
            }
            Context contextK = K();
            PictureSelectionConfig pictureSelectionConfig2 = this.f32146f;
            File fileB = o8.k.b(contextK, pictureSelectionConfig2.f32200b, str, "", pictureSelectionConfig2.Y);
            if (o8.k.q(inputStreamA, new FileOutputStream(fileB.getAbsolutePath()))) {
                o8.j.b(K(), this.f32146f.f32201b0);
                this.f32146f.f32201b0 = fileB.getAbsolutePath();
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    public void w0() {
        String[] strArr = l8.b.f63497b;
        m0(true, strArr);
        if (PictureSelectionConfig.f32182a1 != null) {
            W(a8.c.f3505b, strArr);
        } else {
            l8.a.b().requestPermissions(this, strArr, new k());
        }
    }

    public final void x0() {
        SoundPool soundPool = this.f32148h;
        if (soundPool == null || !this.f32146f.N) {
            return;
        }
        soundPool.play(this.f32149i, 0.1f, 0.5f, 0, 1, 1.0f);
    }

    public final void y() {
        c8.h hVarA;
        if (PictureSelectionConfig.K0 != null || (hVarA = y7.b.c().a()) == null) {
            return;
        }
        PictureSelectionConfig.K0 = hVarA.i();
    }

    public final void y0() {
        try {
            SoundPool soundPool = this.f32148h;
            if (soundPool != null) {
                soundPool.release();
                this.f32148h = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    public static String P(Context context, String str, int i10) {
        if (a8.d.i(str)) {
            return context.getString(R$string.ps_message_video_max_num, String.valueOf(i10));
        }
        if (a8.d.d(str)) {
            return context.getString(R$string.ps_message_audio_max_num, String.valueOf(i10));
        }
        return context.getString(R$string.ps_message_max_num, String.valueOf(i10));
    }

    public final void A() {
        c8.h hVarA;
        c8.h hVarA2;
        if (PictureSelectionConfig.e().f32241v0 && PictureSelectionConfig.R0 == null && (hVarA2 = y7.b.c().a()) != null) {
            PictureSelectionConfig.R0 = hVarA2.b();
        }
        if (PictureSelectionConfig.e().f32243w0 && PictureSelectionConfig.f32193l1 == null && (hVarA = y7.b.c().a()) != null) {
            PictureSelectionConfig.f32193l1 = hVarA.a();
        }
    }

    public void A0(LocalMedia localMedia) {
        if (!o8.a.c(getActivity())) {
            List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
            for (int i10 = 0; i10 < fragments.size(); i10++) {
                Fragment fragment = fragments.get(i10);
                if (fragment instanceof PictureCommonFragment) {
                    ((PictureCommonFragment) fragment).g0(localMedia);
                }
            }
        }
    }

    public final void B() {
        c8.h hVarA;
        if (PictureSelectionConfig.e().f32233r0 && PictureSelectionConfig.W0 == null && (hVarA = y7.b.c().a()) != null) {
            PictureSelectionConfig.W0 = hVarA.h();
        }
    }

    public void B0(boolean z10, LocalMedia localMedia) {
        if (!o8.a.c(getActivity())) {
            List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
            for (int i10 = 0; i10 < fragments.size(); i10++) {
                Fragment fragment = fragments.get(i10);
                if (fragment instanceof PictureCommonFragment) {
                    ((PictureCommonFragment) fragment).r0(z10, localMedia);
                }
            }
        }
    }

    public final void C() {
        c8.h hVarA;
        c8.h hVarA2;
        if (PictureSelectionConfig.e().f32245x0) {
            if (PictureSelectionConfig.Q0 == null && (hVarA2 = y7.b.c().a()) != null) {
                PictureSelectionConfig.Q0 = hVarA2.j();
            }
            if (PictureSelectionConfig.P0 == null && (hVarA = y7.b.c().a()) != null) {
                PictureSelectionConfig.P0 = hVarA.d();
            }
        }
    }

    public void C0() {
        if (!o8.a.c(getActivity())) {
            List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
            for (int i10 = 0; i10 < fragments.size(); i10++) {
                Fragment fragment = fragments.get(i10);
                if (fragment instanceof PictureCommonFragment) {
                    ((PictureCommonFragment) fragment).Z();
                }
            }
        }
    }

    public void E() {
        try {
            if (!o8.a.c(getActivity()) && this.f32147g.isShowing()) {
                this.f32147g.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void F0() {
        if (o8.a.c(getActivity())) {
            return;
        }
        getActivity().setRequestedOrientation(this.f32146f.f32214i);
    }

    public void H() {
        if (k() || !isAdded()) {
            return;
        }
        ArrayList<LocalMedia> arrayList = new ArrayList<>(j8.a.n());
        if (m()) {
            b0(arrayList);
            return;
        }
        if (o()) {
            l0(arrayList);
            return;
        }
        if (l()) {
            a0(arrayList);
        } else if (n()) {
            k0(arrayList);
        } else {
            o0(arrayList);
        }
    }

    public final void I(ArrayList<LocalMedia> arrayList) {
        I0();
        if (j()) {
            h(arrayList);
        } else if (s()) {
            N0(arrayList);
        } else {
            Y(arrayList);
        }
    }

    public void I0() {
        try {
            if (!o8.a.c(getActivity()) && !this.f32147g.isShowing()) {
                this.f32147g.show();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void J(ArrayList<LocalMedia> arrayList) {
        if (s()) {
            N0(arrayList);
        } else {
            Y(arrayList);
        }
    }

    public final void J0(String str) {
        if (o8.a.c(getActivity())) {
            return;
        }
        try {
            Dialog dialog = this.f32151k;
            if (dialog != null && dialog.isShowing()) {
                return;
            }
            b8.d dVarA = b8.d.a(K(), str);
            this.f32151k = dVarA;
            dVarA.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public Context K() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        Context contextB = y7.b.c().b();
        if (contextB != null) {
            return contextB;
        }
        return this.f32152l;
    }

    public void K0() {
        if (!o8.a.c(getActivity())) {
            m0(false, null);
            if (PictureSelectionConfig.U0 != null) {
                i0(1);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                ForegroundService.c(K());
                Uri uriC = o8.i.c(K(), this.f32146f);
                if (uriC != null) {
                    if (this.f32146f.f32216j) {
                        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                    }
                    intent.putExtra("output", uriC);
                    safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
                }
            }
        }
    }

    public void L0() {
        if (!o8.a.c(getActivity())) {
            m0(false, null);
            if (PictureSelectionConfig.U0 != null) {
                i0(2);
                return;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                ForegroundService.c(K());
                Uri uriD = o8.i.d(K(), this.f32146f);
                if (uriD != null) {
                    intent.putExtra("output", uriD);
                    if (this.f32146f.f32216j) {
                        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                    }
                    intent.putExtra("android.intent.extra.quickCapture", this.f32146f.f32219k0);
                    intent.putExtra("android.intent.extra.durationLimit", this.f32146f.f32240v);
                    intent.putExtra("android.intent.extra.videoQuality", this.f32146f.f32230q);
                    safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
                }
            }
        }
    }

    public final void M0(ArrayList<LocalMedia> arrayList) {
        I0();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            concurrentHashMap.put(localMedia.w(), localMedia);
        }
        if (concurrentHashMap.size() == 0) {
            I(arrayList);
        } else {
            PictureThreadUtils.h(new d(concurrentHashMap, arrayList));
        }
    }

    public void S() {
        PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
        if (pictureSelectionConfigE.C != -2) {
            g8.b.d(getActivity(), pictureSelectionConfigE.C, pictureSelectionConfigE.D);
        }
    }

    public int T(LocalMedia localMedia, boolean z10) {
        String strS = localMedia.s();
        long jO = localMedia.o();
        long jA = localMedia.A();
        ArrayList<LocalMedia> arrayListN = j8.a.n();
        if (this.f32146f.Q) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayListN.size(); i11++) {
                if (a8.d.i(arrayListN.get(i11).s())) {
                    i10++;
                }
            }
            if (t(localMedia, z10, strS, i10, jA, jO)) {
                return -1;
            }
            return 200;
        }
        if (q(localMedia, z10, strS, j8.a.o(), jA, jO)) {
            return -1;
        }
        return 200;
    }

    public boolean U() {
        if (!(getActivity() instanceof PictureSelectorSupporterActivity) && !(getActivity() instanceof PictureSelectorTransparentActivity)) {
            return false;
        }
        return true;
    }

    public void X() {
        if (!o8.a.c(getActivity()) && !isStateSaved()) {
            z7.c cVar = PictureSelectionConfig.f32192k1;
            if (cVar != null) {
                cVar.b(this);
            }
            getActivity().getSupportFragmentManager().popBackStack();
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).h0();
            }
        }
    }

    public final void Y(ArrayList<LocalMedia> arrayList) {
        if (!o8.a.c(getActivity())) {
            E();
            if (this.f32146f.f32237t0) {
                getActivity().setResult(-1, z7.j.d(arrayList));
                q0(-1, arrayList);
            } else {
                b0<LocalMedia> b0Var = PictureSelectionConfig.W0;
                if (b0Var != null) {
                    b0Var.a(arrayList);
                }
            }
            f0();
        }
    }

    public void a0(ArrayList<LocalMedia> arrayList) {
        Uri uriFromFile;
        I0();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList<Uri> arrayList2 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            String strF = localMedia.f();
            if (!a8.d.g(strF)) {
                PictureSelectionConfig pictureSelectionConfig = this.f32146f;
                if ((!pictureSelectionConfig.T || !pictureSelectionConfig.I0) && a8.d.h(localMedia.s())) {
                    if (a8.d.c(strF)) {
                        uriFromFile = Uri.parse(strF);
                    } else {
                        uriFromFile = Uri.fromFile(new File(strF));
                    }
                    arrayList2.add(uriFromFile);
                    concurrentHashMap.put(strF, localMedia);
                }
            }
        }
        if (concurrentHashMap.size() == 0) {
            o0(arrayList);
        } else {
            PictureSelectionConfig.M0.a(K(), arrayList2, new n(arrayList, concurrentHashMap));
        }
    }

    public void f0() {
        if (!o8.a.c(getActivity())) {
            if (U()) {
                z7.c cVar = PictureSelectionConfig.f32192k1;
                if (cVar != null) {
                    cVar.b(this);
                }
                getActivity().finish();
            } else {
                List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
                for (int i10 = 0; i10 < fragments.size(); i10++) {
                    if (fragments.get(i10) instanceof PictureCommonFragment) {
                        X();
                    }
                }
            }
        }
        PictureSelectionConfig.c();
    }

    public LocalMedia i(String str) throws Throwable {
        LocalMedia localMediaE = LocalMedia.e(K(), str);
        localMediaE.R(this.f32146f.f32200b);
        if (o8.l.e() && !a8.d.c(str)) {
            localMediaE.s0(str);
        } else {
            localMediaE.s0(null);
        }
        if (this.f32146f.f32221l0 && a8.d.h(localMediaE.s())) {
            o8.c.e(K(), str);
        }
        return localMediaE;
    }

    public void i0(int i10) {
        ForegroundService.c(K());
        PictureSelectionConfig.U0.a(this, i10, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
    }

    public void j0() {
        if (!o8.a.c(getActivity())) {
            if (this.f32146f.f32237t0) {
                getActivity().setResult(0);
                q0(0, null);
            } else {
                b0<LocalMedia> b0Var = PictureSelectionConfig.W0;
                if (b0Var != null) {
                    b0Var.onCancel();
                }
            }
            f0();
        }
    }

    public void k0(ArrayList<LocalMedia> arrayList) {
        I0();
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.T && pictureSelectionConfig.I0) {
            o0(arrayList);
        } else {
            PictureSelectionConfig.L0.a(K(), arrayList, new a());
        }
    }

    public void n0() {
        y();
        D();
        x();
        C();
        A();
        B();
        z();
    }

    public void o0(ArrayList<LocalMedia> arrayList) {
        if (r()) {
            M0(arrayList);
        } else if (p()) {
            v(arrayList);
        } else {
            V(arrayList);
            I(arrayList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Throwable th2;
        boolean z10;
        String path;
        super.onActivityResult(i10, i11, intent);
        ForegroundService.stopService(K());
        if (i11 == -1) {
            if (i10 == 909) {
                G(intent);
                return;
            }
            if (i10 == 696) {
                c0(intent);
                return;
            }
            if (i10 == 69) {
                ArrayList<LocalMedia> arrayListN = j8.a.n();
                try {
                    boolean z11 = false;
                    if (arrayListN.size() == 1) {
                        LocalMedia localMedia = arrayListN.get(0);
                        Uri uriB = a8.a.b(intent);
                        if (uriB != null) {
                            path = uriB.getPath();
                        } else {
                            path = "";
                        }
                        localMedia.b0(path);
                        if (!TextUtils.isEmpty(localMedia.m())) {
                            z11 = true;
                        }
                        localMedia.a0(z11);
                        localMedia.V(a8.a.h(intent));
                        localMedia.U(a8.a.e(intent));
                        localMedia.W(a8.a.f(intent));
                        localMedia.X(a8.a.g(intent));
                        localMedia.Y(a8.a.c(intent));
                        localMedia.Z(a8.a.d(intent));
                        localMedia.s0(localMedia.m());
                    } else {
                        String stringExtra = intent.getStringExtra("output");
                        if (TextUtils.isEmpty(stringExtra)) {
                            stringExtra = intent.getStringExtra("com.yalantis.ucrop.OutputUri");
                        }
                        JSONArray jSONArray = new JSONArray(stringExtra);
                        if (jSONArray.length() == arrayListN.size()) {
                            for (int i12 = 0; i12 < arrayListN.size(); i12++) {
                                LocalMedia localMedia2 = arrayListN.get(i12);
                                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                                localMedia2.b0(jSONObjectOptJSONObject.optString("outPutPath"));
                                if (!TextUtils.isEmpty(localMedia2.m())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                localMedia2.a0(z10);
                                localMedia2.V(jSONObjectOptJSONObject.optInt("imageWidth"));
                                localMedia2.U(jSONObjectOptJSONObject.optInt("imageHeight"));
                                localMedia2.W(jSONObjectOptJSONObject.optInt("offsetX"));
                                localMedia2.X(jSONObjectOptJSONObject.optInt("offsetY"));
                                localMedia2.Y((float) jSONObjectOptJSONObject.optDouble("aspectRatio"));
                                localMedia2.Z(jSONObjectOptJSONObject.optString("customExtraData"));
                                localMedia2.s0(localMedia2.m());
                            }
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    r.c(K(), e10.getMessage());
                }
                ArrayList<LocalMedia> arrayList = new ArrayList<>(arrayListN);
                if (l()) {
                    a0(arrayList);
                    return;
                } else if (n()) {
                    k0(arrayList);
                    return;
                } else {
                    o0(arrayList);
                    return;
                }
            }
            return;
        }
        if (i11 == 96) {
            if (intent != null) {
                th2 = a8.a.a(intent);
            } else {
                th2 = new Throwable("image crop error");
            }
            if (th2 != null) {
                r.c(K(), th2.getMessage());
                return;
            }
            return;
        }
        if (i11 == 0) {
            if (i10 == 909) {
                o8.j.b(K(), this.f32146f.f32201b0);
            } else if (i10 == 1102) {
                R(l8.b.f63496a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        S();
        n0();
        super.onAttach(context);
        this.f32152l = context;
        if (getParentFragment() instanceof com.luck.picture.lib.basic.a) {
            this.f32143c = (com.luck.picture.lib.basic.a) getParentFragment();
        } else if (context instanceof com.luck.picture.lib.basic.a) {
            this.f32143c = (com.luck.picture.lib.basic.a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        S();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (N() != 0) {
            return layoutInflater.inflate(N(), viewGroup, false);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        y0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (this.f32142b != null) {
            l8.a.b().j(iArr, this.f32142b);
            this.f32142b = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig != null) {
            bundle.putParcelable("com.luck.picture.lib.PictureSelectorConfig", pictureSelectionConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f32146f = (PictureSelectionConfig) bundle.getParcelable("com.luck.picture.lib.PictureSelectorConfig");
        }
        if (this.f32146f == null) {
            this.f32146f = PictureSelectionConfig.e();
        }
        z7.c cVar = PictureSelectionConfig.f32192k1;
        if (cVar != null) {
            cVar.a(this, view, bundle);
        }
        f8.f fVar = PictureSelectionConfig.f32197p1;
        if (fVar != null) {
            this.f32147g = fVar.create(K());
        } else {
            this.f32147g = new b8.c(K());
        }
        o8.h.c(requireContext());
        F0();
        H0();
        G0(requireView());
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.N && !pictureSelectionConfig.f32202c) {
            SoundPool soundPool = new SoundPool(1, 3, 0);
            this.f32148h = soundPool;
            this.f32149i = soundPool.load(K(), R$raw.ps_click_music, 1);
        }
    }

    public boolean p() {
        if (o8.l.e() && PictureSelectionConfig.P0 != null) {
            return true;
        }
        return false;
    }

    public final void p0(LocalMedia localMedia) {
        String strY;
        if (o8.a.c(getActivity())) {
            return;
        }
        if (o8.l.e()) {
            if (a8.d.i(localMedia.s()) && a8.d.c(this.f32146f.f32201b0)) {
                new z7.g(getActivity(), localMedia.y());
                return;
            }
            return;
        }
        if (a8.d.c(this.f32146f.f32201b0)) {
            strY = localMedia.y();
        } else {
            strY = this.f32146f.f32201b0;
        }
        new z7.g(getActivity(), strY);
        if (a8.d.h(localMedia.s())) {
            int iE = o8.j.e(K(), new File(strY).getParent());
            if (iE != -1) {
                o8.j.o(K(), iE);
            }
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    public boolean q(LocalMedia localMedia, boolean z10, String str, String str2, long j10, long j11) {
        if (a8.d.k(str2, str)) {
            PictureSelectionConfig pictureSelectionConfig = this.f32146f;
            long j12 = pictureSelectionConfig.A;
            if (j12 > 0 && j10 > j12) {
                e0 e0Var = PictureSelectionConfig.V0;
                if (e0Var != null && e0Var.a(K(), localMedia, this.f32146f, 1)) {
                    return true;
                }
                J0(getString(R$string.ps_select_max_size, o8.k.f(this.f32146f.A)));
                return true;
            }
            long j13 = pictureSelectionConfig.B;
            if (j13 > 0 && j10 < j13) {
                e0 e0Var2 = PictureSelectionConfig.V0;
                if (e0Var2 != null && e0Var2.a(K(), localMedia, this.f32146f, 2)) {
                    return true;
                }
                J0(getString(R$string.ps_select_min_size, o8.k.f(this.f32146f.B)));
                return true;
            }
            if (a8.d.i(str)) {
                PictureSelectionConfig pictureSelectionConfig2 = this.f32146f;
                if (pictureSelectionConfig2.f32218k == 2) {
                    int i10 = pictureSelectionConfig2.f32224n;
                    if (i10 <= 0) {
                        i10 = pictureSelectionConfig2.f32220l;
                    }
                    pictureSelectionConfig2.f32224n = i10;
                    if (!z10 && j8.a.l() >= this.f32146f.f32224n) {
                        e0 e0Var3 = PictureSelectionConfig.V0;
                        if (e0Var3 != null && e0Var3.a(K(), localMedia, this.f32146f, 6)) {
                            return true;
                        }
                        J0(P(K(), str, this.f32146f.f32224n));
                        return true;
                    }
                }
                if (!z10 && this.f32146f.f32238u > 0 && o8.d.i(j11) < this.f32146f.f32238u) {
                    e0 e0Var4 = PictureSelectionConfig.V0;
                    if (e0Var4 != null && e0Var4.a(K(), localMedia, this.f32146f, 9)) {
                        return true;
                    }
                    J0(getString(R$string.ps_select_video_min_second, Integer.valueOf(this.f32146f.f32238u / 1000)));
                    return true;
                }
                if (!z10 && this.f32146f.f32236t > 0 && o8.d.i(j11) > this.f32146f.f32236t) {
                    e0 e0Var5 = PictureSelectionConfig.V0;
                    if (e0Var5 != null && e0Var5.a(K(), localMedia, this.f32146f, 8)) {
                        return true;
                    }
                    J0(getString(R$string.ps_select_video_max_second, Integer.valueOf(this.f32146f.f32236t / 1000)));
                    return true;
                }
            } else if (a8.d.d(str)) {
                if (this.f32146f.f32218k == 2 && !z10 && j8.a.n().size() >= this.f32146f.f32220l) {
                    e0 e0Var6 = PictureSelectionConfig.V0;
                    if (e0Var6 != null && e0Var6.a(K(), localMedia, this.f32146f, 4)) {
                        return true;
                    }
                    J0(P(K(), str, this.f32146f.f32220l));
                    return true;
                }
                if (!z10 && this.f32146f.f32238u > 0 && o8.d.i(j11) < this.f32146f.f32238u) {
                    e0 e0Var7 = PictureSelectionConfig.V0;
                    if (e0Var7 != null && e0Var7.a(K(), localMedia, this.f32146f, 11)) {
                        return true;
                    }
                    J0(getString(R$string.ps_select_audio_min_second, Integer.valueOf(this.f32146f.f32238u / 1000)));
                    return true;
                }
                if (!z10 && this.f32146f.f32236t > 0 && o8.d.i(j11) > this.f32146f.f32236t) {
                    e0 e0Var8 = PictureSelectionConfig.V0;
                    if (e0Var8 != null && e0Var8.a(K(), localMedia, this.f32146f, 10)) {
                        return true;
                    }
                    J0(getString(R$string.ps_select_audio_max_second, Integer.valueOf(this.f32146f.f32236t / 1000)));
                    return true;
                }
            } else if (this.f32146f.f32218k == 2 && !z10 && j8.a.n().size() >= this.f32146f.f32220l) {
                e0 e0Var9 = PictureSelectionConfig.V0;
                if (e0Var9 != null && e0Var9.a(K(), localMedia, this.f32146f, 4)) {
                    return true;
                }
                J0(P(K(), str, this.f32146f.f32220l));
                return true;
            }
            return false;
        }
        e0 e0Var10 = PictureSelectionConfig.V0;
        if (e0Var10 != null && e0Var10.a(K(), localMedia, this.f32146f, 3)) {
            return true;
        }
        J0(getString(R$string.ps_rule));
        return true;
    }

    public boolean r() {
        if (o8.l.e() && PictureSelectionConfig.Q0 != null) {
            return true;
        }
        return false;
    }

    public void s0() {
        PhotoItemSelectedDialog photoItemSelectedDialogD = PhotoItemSelectedDialog.d();
        photoItemSelectedDialogD.f(new h());
        photoItemSelectedDialogD.e(new i());
        photoItemSelectedDialogD.show(getChildFragmentManager(), "PhotoItemSelectedDialog");
    }

    @Deprecated
    public final void v(ArrayList<LocalMedia> arrayList) {
        I0();
        PictureThreadUtils.h(new e(arrayList));
    }

    public final void x() {
        c8.h hVarA;
        c8.h hVarA2;
        if (PictureSelectionConfig.e().f32239u0) {
            if (PictureSelectionConfig.M0 == null && (hVarA2 = y7.b.c().a()) != null) {
                PictureSelectionConfig.M0 = hVarA2.f();
            }
            if (PictureSelectionConfig.L0 == null && (hVarA = y7.b.c().a()) != null) {
                PictureSelectionConfig.L0 = hVarA.g();
            }
        }
    }

    public final void z() {
        c8.h hVarA;
        if (PictureSelectionConfig.e().f32235s0 && PictureSelectionConfig.f32183b1 == null && (hVarA = y7.b.c().a()) != null) {
            PictureSelectionConfig.f32183b1 = hVarA.c();
        }
    }
}
