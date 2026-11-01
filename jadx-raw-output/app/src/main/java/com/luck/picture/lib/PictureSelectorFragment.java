package com.luck.picture.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.animators.AlphaInAnimationAdapter;
import com.luck.picture.lib.animators.SlideInBottomAnimationAdapter;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.decoration.GridSpacingItemDecoration;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.RecyclerPreloadView;
import com.luck.picture.lib.widget.SlideSelectTouchListener;
import com.luck.picture.lib.widget.TitleBar;
import f8.a0;
import f8.c0;
import f8.x;
import f8.y;
import f8.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PictureSelectorFragment extends PictureCommonFragment implements x {
    public static final String C = PictureSelectorFragment.class.getSimpleName();
    public static int D = 135;
    public static final Object E = new Object();
    public b8.a A;
    public SlideSelectTouchListener B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerPreloadView f31918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TitleBar f31920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public BottomNavBar f31921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CompleteSelectView f31922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f31923s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31925u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f31928x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31929y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PictureImageGridAdapter f31930z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f31924t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31926v = -1;

    public class a implements f8.t<LocalMediaFolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31931a;

        public a(boolean z10) {
            this.f31931a = z10;
        }

        @Override // f8.t
        public void a(List<LocalMediaFolder> list) {
            PictureSelectorFragment.this.K1(this.f31931a, list);
        }
    }

    public class b extends f8.u<LocalMedia> {
        public b() {
        }

        @Override // f8.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.L1(arrayList, z10);
        }
    }

    public class c extends f8.u<LocalMedia> {
        public c() {
        }

        @Override // f8.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.L1(arrayList, z10);
        }
    }

    public class d implements f8.s<LocalMediaFolder> {
        public d() {
        }

        @Override // f8.s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment.this.M1(localMediaFolder);
        }
    }

    public class e implements f8.s<LocalMediaFolder> {
        public e() {
        }

        @Override // f8.s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment.this.M1(localMediaFolder);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.f31918n.scrollToPosition(PictureSelectorFragment.this.f31926v);
            PictureSelectorFragment.this.f31918n.setLastVisiblePosition(PictureSelectorFragment.this.f31926v);
        }
    }

    public class g implements PictureImageGridAdapter.b {
        public g() {
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public int a(View view, int i10, LocalMedia localMedia) {
            int iU = PictureSelectorFragment.this.u(localMedia, view.isSelected());
            if (iU == 0) {
                c0 c0Var = PictureSelectionConfig.f32196o1;
                if (c0Var != null) {
                    long jA = c0Var.a(view);
                    if (jA > 0) {
                        int unused = PictureSelectorFragment.D = (int) jA;
                    }
                } else {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(PictureSelectorFragment.this.getContext(), R$anim.ps_anim_modal_in);
                    int unused2 = PictureSelectorFragment.D = (int) animationLoadAnimation.getDuration();
                    view.startAnimation(animationLoadAnimation);
                }
            }
            return iU;
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public void c(View view, int i10, LocalMedia localMedia) {
            if (PictureSelectorFragment.this.f32146f.f32218k != 1 || !PictureSelectorFragment.this.f32146f.f32204d) {
                if (o8.f.a()) {
                    return;
                }
                PictureSelectorFragment.this.f2(i10, false);
            } else {
                j8.a.h();
                if (PictureSelectorFragment.this.u(localMedia, false) == 0) {
                    PictureSelectorFragment.this.H();
                }
            }
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public void d(View view, int i10) {
            if (PictureSelectorFragment.this.B == null || !PictureSelectorFragment.this.f32146f.A0) {
                return;
            }
            ((Vibrator) PictureSelectorFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            PictureSelectorFragment.this.B.p(i10);
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public void b() {
            if (o8.f.a()) {
                return;
            }
            PictureSelectorFragment.this.u0();
        }
    }

    public class h implements z {
        public h() {
        }

        @Override // f8.z
        public void a() {
            c8.f fVar = PictureSelectionConfig.K0;
            if (fVar != null) {
                fVar.d(PictureSelectorFragment.this.getContext());
            }
        }

        @Override // f8.z
        public void b() {
            c8.f fVar = PictureSelectionConfig.K0;
            if (fVar != null) {
                fVar.b(PictureSelectorFragment.this.getContext());
            }
        }
    }

    public class i implements y {
        @Override // f8.y
        public void a(int i10) {
            if (i10 == 1) {
                PictureSelectorFragment.this.p2();
            } else if (i10 == 0) {
                PictureSelectorFragment.this.Q1();
            }
        }

        public i() {
        }

        @Override // f8.y
        public void b(int i10, int i11) {
            PictureSelectorFragment.this.o2();
        }
    }

    public class j implements com.luck.picture.lib.widget.a.InterfaceC0296a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashSet f31941a;

        @Override // com.luck.picture.lib.widget.a.InterfaceC0296a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HashSet<Integer> getSelection() {
            for (int i10 = 0; i10 < j8.a.l(); i10++) {
                this.f31941a.add(Integer.valueOf(j8.a.n().get(i10).f32272n));
            }
            return this.f31941a;
        }

        public j(HashSet hashSet) {
            this.f31941a = hashSet;
        }

        @Override // com.luck.picture.lib.widget.a.InterfaceC0296a
        public void a(int i10, int i11, boolean z10, boolean z11) {
            ArrayList<LocalMedia> arrayListD = PictureSelectorFragment.this.f31930z.d();
            if (arrayListD.size() == 0 || i10 > arrayListD.size()) {
                return;
            }
            LocalMedia localMedia = arrayListD.get(i10);
            PictureSelectorFragment.this.B.m(PictureSelectorFragment.this.u(localMedia, j8.a.n().contains(localMedia)) != -1);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.f31930z.notifyDataSetChanged();
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f31944b;

        public l(ArrayList arrayList) {
            this.f31944b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.n2(this.f31944b);
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.a2();
        }
    }

    public class n extends f8.u<LocalMedia> {
        public n() {
        }

        @Override // f8.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.N1(arrayList, z10);
        }
    }

    public class o extends f8.u<LocalMedia> {
        public o() {
        }

        @Override // f8.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.N1(arrayList, z10);
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureSelectorFragment.this.f32146f.O && j8.a.l() == 0) {
                PictureSelectorFragment.this.f0();
            } else {
                PictureSelectorFragment.this.H();
            }
        }
    }

    public class q extends TitleBar.a {
        public q() {
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void a() {
            if (PictureSelectorFragment.this.A.isShowing()) {
                PictureSelectorFragment.this.A.dismiss();
            } else {
                PictureSelectorFragment.this.j0();
            }
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void b(View view) {
            PictureSelectorFragment.this.A.showAsDropDown(view);
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void c() {
            if (PictureSelectorFragment.this.f32146f.f32217j0) {
                if (SystemClock.uptimeMillis() - PictureSelectorFragment.this.f31924t < 500 && PictureSelectorFragment.this.f31930z.getItemCount() > 0) {
                    PictureSelectorFragment.this.f31918n.scrollToPosition(0);
                } else {
                    PictureSelectorFragment.this.f31924t = SystemClock.uptimeMillis();
                }
            }
        }
    }

    public class r implements b8.a.d {
        public r() {
        }

        @Override // b8.a.d
        public void a() {
            if (PictureSelectorFragment.this.f32146f.f32229p0) {
                return;
            }
            o8.b.a(PictureSelectorFragment.this.f31920p.getImageArrow(), true);
        }

        @Override // b8.a.d
        public void b() {
            if (PictureSelectorFragment.this.f32146f.f32229p0) {
                return;
            }
            o8.b.a(PictureSelectorFragment.this.f31920p.getImageArrow(), false);
        }
    }

    public class s implements l8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f31952a;

        public s(String[] strArr) {
            this.f31952a = strArr;
        }

        @Override // l8.c
        public void a() {
            PictureSelectorFragment.this.Q(this.f31952a);
        }

        @Override // l8.c
        public void onGranted() {
            PictureSelectorFragment.this.I1();
        }
    }

    public class t implements a0 {
        public t() {
        }
    }

    public class u implements f8.a {

        public class a extends f8.u<LocalMedia> {
            public a() {
            }

            @Override // f8.u
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                PictureSelectorFragment.this.P1(arrayList, z10);
            }
        }

        public class b extends f8.u<LocalMedia> {
            public b() {
            }

            @Override // f8.u
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                PictureSelectorFragment.this.P1(arrayList, z10);
            }
        }

        public u() {
        }

        @Override // f8.a
        public void a(int i10, LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment pictureSelectorFragment = PictureSelectorFragment.this;
            pictureSelectorFragment.f31929y = pictureSelectorFragment.f32146f.E && localMediaFolder.c() == -1;
            PictureSelectorFragment.this.f31930z.l(PictureSelectorFragment.this.f31929y);
            PictureSelectorFragment.this.f31920p.setTitle(localMediaFolder.h());
            LocalMediaFolder localMediaFolderJ = j8.a.j();
            long jC = localMediaFolderJ.c();
            if (PictureSelectorFragment.this.f32146f.f32209f0) {
                if (localMediaFolder.c() != jC) {
                    localMediaFolderJ.n(PictureSelectorFragment.this.f31930z.d());
                    localMediaFolderJ.m(PictureSelectorFragment.this.f32144d);
                    localMediaFolderJ.s(PictureSelectorFragment.this.f31918n.a());
                    if (localMediaFolder.e().size() <= 0 || localMediaFolder.j()) {
                        PictureSelectorFragment.this.f32144d = 1;
                        c8.e eVar = PictureSelectionConfig.R0;
                        if (eVar != null) {
                            eVar.c(PictureSelectorFragment.this.getContext(), localMediaFolder.c(), PictureSelectorFragment.this.f32144d, PictureSelectorFragment.this.f32146f.f32207e0, new a());
                        } else {
                            PictureSelectorFragment.this.f32145e.h(localMediaFolder.c(), PictureSelectorFragment.this.f32144d, PictureSelectorFragment.this.f32146f.f32207e0, new b());
                        }
                    } else {
                        PictureSelectorFragment.this.m2(localMediaFolder.e());
                        PictureSelectorFragment.this.f32144d = localMediaFolder.d();
                        PictureSelectorFragment.this.f31918n.setEnabledLoadMore(localMediaFolder.j());
                        PictureSelectorFragment.this.f31918n.smoothScrollToPosition(0);
                    }
                }
            } else if (localMediaFolder.c() != jC) {
                PictureSelectorFragment.this.m2(localMediaFolder.e());
                PictureSelectorFragment.this.f31918n.smoothScrollToPosition(0);
            }
            j8.a.p(localMediaFolder);
            PictureSelectorFragment.this.A.dismiss();
            if (PictureSelectorFragment.this.B == null || !PictureSelectorFragment.this.f32146f.A0) {
                return;
            }
            PictureSelectorFragment.this.B.n(PictureSelectorFragment.this.f31930z.g() ? 1 : 0);
        }
    }

    public class v extends BottomNavBar.b {
        public v() {
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void a() {
            PictureSelectorFragment.this.C0();
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void d() {
            PictureSelectorFragment.this.f2(0, true);
        }
    }

    public class w implements f8.t<LocalMediaFolder> {
        public w() {
        }

        @Override // f8.t
        public void a(List<LocalMediaFolder> list) {
            PictureSelectorFragment.this.K1(false, list);
        }
    }

    public final void I1() {
        m0(false, null);
        if (this.f32146f.f32229p0) {
            b2();
        } else {
            Y1();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void R(String[] strArr) {
        m0(false, null);
        boolean z10 = strArr.length > 0 && TextUtils.equals(strArr[0], l8.b.f63497b[0]);
        f8.p pVar = PictureSelectionConfig.f32182a1;
        if (pVar != null ? pVar.a(this, strArr) : l8.a.h(getContext(), strArr)) {
            if (z10) {
                u0();
            } else {
                I1();
            }
        } else if (z10) {
            o8.r.c(getContext(), getString(R$string.ps_camera));
        } else {
            o8.r.c(getContext(), getString(R$string.ps_jurisdiction));
            j0();
        }
        l8.b.f63496a = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void W(int i10, String[] strArr) {
        if (i10 != -1) {
            super.W(i10, strArr);
        } else {
            PictureSelectionConfig.f32182a1.b(this, strArr, new t());
        }
    }

    public final boolean X1(int i10) {
        int i11;
        return i10 != 0 && (i11 = this.f31925u) > 0 && i11 < i10;
    }

    public final void k2(List<LocalMedia> list) {
        try {
            try {
                if (this.f32146f.f32209f0 && this.f31927w) {
                    synchronized (E) {
                        Iterator<LocalMedia> it = list.iterator();
                        while (it.hasNext()) {
                            if (this.f31930z.d().contains(it.next())) {
                                it.remove();
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f31927w = false;
        } catch (Throwable th2) {
            this.f31927w = false;
            throw th2;
        }
    }

    public static PictureSelectorFragment d2() {
        PictureSelectorFragment pictureSelectorFragment = new PictureSelectorFragment();
        pictureSelectorFragment.setArguments(new Bundle());
        return pictureSelectorFragment;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void F(LocalMedia localMedia) {
        if (!X1(this.A.g())) {
            this.f31930z.d().add(0, localMedia);
            this.f31927w = true;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.f32218k == 1 && pictureSelectionConfig.f32204d) {
            j8.a.h();
            if (u(localMedia, false) == 0) {
                H();
            }
        } else {
            u(localMedia, false);
        }
        this.f31930z.notifyItemInserted(this.f32146f.E ? 1 : 0);
        PictureImageGridAdapter pictureImageGridAdapter = this.f31930z;
        boolean z10 = this.f32146f.E;
        pictureImageGridAdapter.notifyItemRangeChanged(z10 ? 1 : 0, pictureImageGridAdapter.d().size());
        if (this.f32146f.f32229p0) {
            LocalMediaFolder localMediaFolderJ = j8.a.j();
            if (localMediaFolderJ == null) {
                localMediaFolderJ = new LocalMediaFolder();
            }
            localMediaFolderJ.l(o8.s.e(Integer.valueOf(localMedia.v().hashCode())));
            localMediaFolderJ.q(localMedia.v());
            localMediaFolderJ.p(localMedia.s());
            localMediaFolderJ.o(localMedia.w());
            localMediaFolderJ.r(this.f31930z.d().size());
            localMediaFolderJ.m(this.f32144d);
            localMediaFolderJ.s(false);
            localMediaFolderJ.n(this.f31930z.d());
            this.f31918n.setEnabledLoadMore(false);
            j8.a.p(localMediaFolderJ);
        } else {
            c2(localMedia);
        }
        this.f31925u = 0;
        if (this.f31930z.d().size() > 0 || this.f32146f.f32204d) {
            R1();
        } else {
            q2();
        }
    }

    public final void G1() {
        this.A.k(new u());
    }

    public final void H1() {
        this.f31930z.m(new g());
        this.f31918n.setOnRecyclerViewScrollStateListener(new h());
        this.f31918n.setOnRecyclerViewScrollListener(new i());
        if (this.f32146f.A0) {
            SlideSelectTouchListener slideSelectTouchListenerR = new SlideSelectTouchListener().n(this.f31930z.g() ? 1 : 0).r(new com.luck.picture.lib.widget.a(new j(new HashSet())));
            this.B = slideSelectTouchListenerR;
            this.f31918n.addOnItemTouchListener(slideSelectTouchListenerR);
        }
    }

    public final boolean J1(boolean z10) {
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (!pictureSelectionConfig.f32213h0) {
            return false;
        }
        if (pictureSelectionConfig.Q) {
            if (pictureSelectionConfig.f32218k == 1) {
                return false;
            }
            if (j8.a.l() != this.f32146f.f32220l && (z10 || j8.a.l() != this.f32146f.f32220l - 1)) {
                return false;
            }
        } else if (j8.a.l() != 0 && (!z10 || j8.a.l() != 1)) {
            if (a8.d.i(j8.a.o())) {
                PictureSelectionConfig pictureSelectionConfig2 = this.f32146f;
                int i10 = pictureSelectionConfig2.f32224n;
                if (i10 <= 0) {
                    i10 = pictureSelectionConfig2.f32220l;
                }
                if (j8.a.l() != i10 && (z10 || j8.a.l() != i10 - 1)) {
                    return false;
                }
            } else if (j8.a.l() != this.f32146f.f32220l && (z10 || j8.a.l() != this.f32146f.f32220l - 1)) {
                return false;
            }
        }
        return true;
    }

    public final void Q1() {
        if (!this.f32146f.f32249z0 || this.f31930z.d().size() <= 0) {
            return;
        }
        this.f31923s.animate().setDuration(250L).alpha(0.0f).start();
    }

    public final void R1() {
        if (this.f31919o.getVisibility() == 0) {
            this.f31919o.setVisibility(8);
        }
    }

    public final void T1() {
        this.f31921q.f();
        this.f31921q.setOnBottomNavBarListener(new v());
        this.f31921q.h();
    }

    public final void U1() {
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.f32218k == 1 && pictureSelectionConfig.f32204d) {
            PictureSelectionConfig.T0.d().w(false);
            this.f31920p.getTitleCancelView().setVisibility(0);
            this.f31922r.setVisibility(8);
            return;
        }
        this.f31922r.c();
        this.f31922r.setSelectedChange(false);
        if (PictureSelectionConfig.T0.c().T()) {
            if (this.f31922r.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f31922r.getLayoutParams();
                int i10 = R$id.title_bar;
                layoutParams.topToTop = i10;
                ((ConstraintLayout.LayoutParams) this.f31922r.getLayoutParams()).bottomToBottom = i10;
                if (this.f32146f.L) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f31922r.getLayoutParams())).topMargin = o8.e.i(getContext());
                }
            } else if ((this.f31922r.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f32146f.L) {
                ((RelativeLayout.LayoutParams) this.f31922r.getLayoutParams()).topMargin = o8.e.i(getContext());
            }
        }
        this.f31922r.setOnClickListener(new p());
    }

    public final void V1(View view) {
        this.f31918n = (RecyclerPreloadView) view.findViewById(R$id.recycler);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int iA = selectMainStyleC.A();
        if (o8.q.c(iA)) {
            this.f31918n.setBackgroundColor(iA);
        } else {
            this.f31918n.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_black));
        }
        int i10 = this.f32146f.f32244x;
        if (i10 <= 0) {
            i10 = 4;
        }
        if (this.f31918n.getItemDecorationCount() == 0) {
            if (o8.q.b(selectMainStyleC.o())) {
                this.f31918n.addItemDecoration(new GridSpacingItemDecoration(i10, selectMainStyleC.o(), selectMainStyleC.S()));
            } else {
                this.f31918n.addItemDecoration(new GridSpacingItemDecoration(i10, o8.e.a(view.getContext(), 1.0f), selectMainStyleC.S()));
            }
        }
        this.f31918n.setLayoutManager(new GridLayoutManager(getContext(), i10));
        RecyclerView.ItemAnimator itemAnimator = this.f31918n.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f31918n.setItemAnimator(null);
        }
        if (this.f32146f.f32209f0) {
            this.f31918n.setReachBottomRow(2);
            this.f31918n.setOnRecyclerViewPreloadListener(this);
        } else {
            this.f31918n.setHasFixedSize(true);
        }
        PictureImageGridAdapter pictureImageGridAdapter = new PictureImageGridAdapter(getContext(), this.f32146f);
        this.f31930z = pictureImageGridAdapter;
        pictureImageGridAdapter.l(this.f31929y);
        int i11 = this.f32146f.f32215i0;
        if (i11 == 1) {
            this.f31918n.setAdapter(new AlphaInAnimationAdapter(this.f31930z));
        } else if (i11 != 2) {
            this.f31918n.setAdapter(this.f31930z);
        } else {
            this.f31918n.setAdapter(new SlideInBottomAnimationAdapter(this.f31930z));
        }
        H1();
    }

    public final void W1() {
        if (PictureSelectionConfig.T0.d().u()) {
            this.f31920p.setVisibility(8);
        }
        this.f31920p.d();
        this.f31920p.setOnTitleBarListener(new q());
    }

    public void Y1() {
        c8.e eVar = PictureSelectionConfig.R0;
        if (eVar != null) {
            eVar.d(getContext(), new w());
        } else {
            this.f32145e.f(new a(g2()));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void Z() {
        this.f31921q.g();
    }

    public void Z1(long j10) {
        this.f32144d = 1;
        this.f31918n.setEnabledLoadMore(true);
        c8.e eVar = PictureSelectionConfig.R0;
        if (eVar != null) {
            Context context = getContext();
            int i10 = this.f32144d;
            eVar.c(context, j10, i10, i10 * this.f32146f.f32207e0, new b());
        } else {
            h8.a aVar = this.f32145e;
            int i11 = this.f32144d;
            aVar.h(j10, i11, i11 * this.f32146f.f32207e0, new c());
        }
    }

    @Override // f8.x
    public void a() {
        if (this.f31928x) {
            requireView().postDelayed(new m(), 350L);
        } else {
            a2();
        }
    }

    public void a2() {
        if (this.f31918n.a()) {
            this.f32144d++;
            LocalMediaFolder localMediaFolderJ = j8.a.j();
            long jC = localMediaFolderJ != null ? localMediaFolderJ.c() : 0L;
            c8.e eVar = PictureSelectionConfig.R0;
            if (eVar == null) {
                this.f32145e.h(jC, this.f32144d, this.f32146f.f32207e0, new o());
                return;
            }
            Context context = getContext();
            int i10 = this.f32144d;
            int i11 = this.f32146f.f32207e0;
            eVar.b(context, jC, i10, i11, i11, new n());
        }
    }

    public void b2() {
        c8.e eVar = PictureSelectionConfig.R0;
        if (eVar != null) {
            eVar.a(getContext(), new d());
        } else {
            this.f32145e.g(new e());
        }
    }

    public final void c2(LocalMedia localMedia) {
        LocalMediaFolder localMediaFolderH;
        List<LocalMediaFolder> listF = this.A.f();
        if (this.A.i() == 0) {
            localMediaFolderH = new LocalMediaFolder();
            localMediaFolderH.q(TextUtils.isEmpty(this.f32146f.f32205d0) ? getString(this.f32146f.f32200b == a8.e.b() ? R$string.ps_all_audio : R$string.ps_camera_roll) : this.f32146f.f32205d0);
            localMediaFolderH.o("");
            localMediaFolderH.l(-1L);
            listF.add(0, localMediaFolderH);
        } else {
            localMediaFolderH = this.A.h(0);
        }
        localMediaFolderH.o(localMedia.w());
        localMediaFolderH.p(localMedia.s());
        localMediaFolderH.n(this.f31930z.d());
        localMediaFolderH.l(-1L);
        localMediaFolderH.r(X1(localMediaFolderH.i()) ? localMediaFolderH.i() : localMediaFolderH.i() + 1);
        LocalMediaFolder localMediaFolderJ = j8.a.j();
        if (localMediaFolderJ == null || localMediaFolderJ.i() == 0) {
            j8.a.p(localMediaFolderH);
        }
        LocalMediaFolder localMediaFolder = null;
        for (int i10 = 0; i10 < listF.size(); i10++) {
            LocalMediaFolder localMediaFolder2 = listF.get(i10);
            if (TextUtils.equals(localMediaFolder2.h(), localMedia.v())) {
                localMediaFolder = localMediaFolder2;
                break;
            }
        }
        if (localMediaFolder == null) {
            localMediaFolder = new LocalMediaFolder();
            listF.add(localMediaFolder);
        }
        localMediaFolder.q(localMedia.v());
        if (localMediaFolder.c() == -1 || localMediaFolder.c() == 0) {
            localMediaFolder.l(localMedia.g());
        }
        if (this.f32146f.f32209f0) {
            localMediaFolder.s(true);
        } else if (!X1(localMediaFolderH.i()) || !TextUtils.isEmpty(this.f32146f.X) || !TextUtils.isEmpty(this.f32146f.Y)) {
            localMediaFolder.e().add(0, localMedia);
        }
        localMediaFolder.r(X1(localMediaFolderH.i()) ? localMediaFolder.i() : localMediaFolder.i() + 1);
        localMediaFolder.o(this.f32146f.f32201b0);
        localMediaFolder.p(localMedia.s());
        this.A.c(listF);
    }

    public void e2() {
        z7.b bVar = PictureSelectionConfig.f32193l1;
        if (bVar != null) {
            h8.a aVarA = bVar.a();
            this.f32145e = aVarA;
            if (aVarA == null) {
                throw new NullPointerException("No available " + h8.a.class + " loader found");
            }
        } else {
            this.f32145e = this.f32146f.f32209f0 ? new h8.d() : new h8.b();
        }
        this.f32145e.e(getContext(), this.f32146f);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void g0(LocalMedia localMedia) {
        this.f31930z.h(localMedia.f32272n);
    }

    public final boolean g2() {
        Context contextRequireContext;
        int i10;
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (!pictureSelectionConfig.f32209f0 || !pictureSelectionConfig.J0) {
            return false;
        }
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.l(-1L);
        if (TextUtils.isEmpty(this.f32146f.f32205d0)) {
            TitleBar titleBar = this.f31920p;
            if (this.f32146f.f32200b == a8.e.b()) {
                contextRequireContext = requireContext();
                i10 = R$string.ps_all_audio;
            } else {
                contextRequireContext = requireContext();
                i10 = R$string.ps_camera_roll;
            }
            titleBar.setTitle(contextRequireContext.getString(i10));
        } else {
            this.f31920p.setTitle(this.f32146f.f32205d0);
        }
        localMediaFolder.q(this.f31920p.getTitleText());
        j8.a.p(localMediaFolder);
        Z1(localMediaFolder.c());
        return true;
    }

    public void h2(Bundle bundle) {
        if (bundle == null) {
            this.f31929y = this.f32146f.E;
            return;
        }
        this.f31925u = bundle.getInt("com.luck.picture.lib.all_folder_size");
        this.f32144d = bundle.getInt("com.luck.picture.lib.current_page", this.f32144d);
        this.f31926v = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f31926v);
        this.f31929y = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f32146f.E);
    }

    public final void i2() {
        this.f31930z.l(this.f31929y);
        D0(0L);
        if (this.f32146f.f32229p0) {
            M1(j8.a.j());
        } else {
            O1(new ArrayList(j8.a.i()));
        }
    }

    public final void j2() {
        if (this.f31926v > 0) {
            this.f31918n.post(new f());
        }
    }

    public final void l2() {
        this.f31930z.l(this.f31929y);
        if (l8.a.f(this.f32146f.f32200b, getContext())) {
            I1();
            return;
        }
        String[] strArrA = l8.b.a(this.f32146f.f32200b);
        m0(true, strArrA);
        if (PictureSelectionConfig.f32182a1 != null) {
            W(-1, strArrA);
        } else {
            l8.a.b().requestPermissions(this, strArrA, new s(strArrA));
        }
    }

    public final void n2(ArrayList<LocalMedia> arrayList) {
        D0(0L);
        z0(false);
        this.f31930z.k(arrayList);
        j8.a.e();
        j8.a.f();
        j2();
        if (this.f31930z.f()) {
            q2();
        } else {
            R1();
        }
    }

    public final void o2() {
        int firstVisiblePosition;
        if (!this.f32146f.f32249z0 || (firstVisiblePosition = this.f31918n.getFirstVisiblePosition()) == -1) {
            return;
        }
        ArrayList<LocalMedia> arrayListD = this.f31930z.d();
        if (arrayListD.size() <= firstVisiblePosition || arrayListD.get(firstVisiblePosition).n() <= 0) {
            return;
        }
        this.f31923s.setText(o8.d.e(getContext(), arrayListD.get(firstVisiblePosition).n()));
    }

    public final void p2() {
        if (this.f32146f.f32249z0 && this.f31930z.d().size() > 0 && this.f31923s.getAlpha() == 0.0f) {
            this.f31923s.animate().setDuration(150L).alphaBy(1.0f).start();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void r0(boolean z10, LocalMedia localMedia) {
        this.f31921q.h();
        this.f31922r.setSelectedChange(false);
        if (J1(z10)) {
            this.f31930z.h(localMedia.f32272n);
            this.f31918n.postDelayed(new k(), D);
        } else {
            this.f31930z.h(localMedia.f32272n);
        }
        if (z10) {
            return;
        }
        z0(true);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void z0(boolean z10) {
        if (PictureSelectionConfig.T0.c().Y()) {
            int i10 = 0;
            while (i10 < j8.a.l()) {
                LocalMedia localMedia = j8.a.n().get(i10);
                i10++;
                localMedia.l0(i10);
                if (z10) {
                    this.f31930z.h(localMedia.f32272n);
                }
            }
        }
    }

    public final void K1(boolean z10, List<LocalMediaFolder> list) {
        LocalMediaFolder localMediaFolderJ;
        if (o8.a.c(getActivity())) {
            return;
        }
        if (list.size() > 0) {
            if (z10) {
                localMediaFolderJ = list.get(0);
                j8.a.p(localMediaFolderJ);
            } else if (j8.a.j() != null) {
                localMediaFolderJ = j8.a.j();
            } else {
                localMediaFolderJ = list.get(0);
                j8.a.p(localMediaFolderJ);
            }
            this.f31920p.setTitle(localMediaFolderJ.h());
            this.A.c(list);
            PictureSelectionConfig pictureSelectionConfig = this.f32146f;
            if (pictureSelectionConfig.f32209f0) {
                if (pictureSelectionConfig.J0) {
                    this.f31918n.setEnabledLoadMore(true);
                    return;
                } else {
                    Z1(localMediaFolderJ.c());
                    return;
                }
            }
            m2(localMediaFolderJ.e());
            return;
        }
        q2();
    }

    public final void L1(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (o8.a.c(getActivity())) {
            return;
        }
        this.f31918n.setEnabledLoadMore(z10);
        if (this.f31918n.a() && arrayList.size() == 0) {
            a();
        } else {
            m2(arrayList);
        }
    }

    public final void M1(LocalMediaFolder localMediaFolder) {
        boolean z10;
        String name;
        if (!o8.a.c(getActivity())) {
            String str = this.f32146f.Z;
            if (localMediaFolder != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                name = localMediaFolder.h();
            } else {
                name = new File(str).getName();
            }
            this.f31920p.setTitle(name);
            if (z10) {
                j8.a.p(localMediaFolder);
                m2(localMediaFolder.e());
            } else {
                q2();
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        int iA = a8.b.a(getContext(), 1);
        if (iA != 0) {
            return iA;
        }
        return R$layout.ps_fragment_selector;
    }

    public final void N1(List<LocalMedia> list, boolean z10) {
        if (o8.a.c(getActivity())) {
            return;
        }
        this.f31918n.setEnabledLoadMore(z10);
        if (this.f31918n.a()) {
            k2(list);
            if (list.size() > 0) {
                int size = this.f31930z.d().size();
                this.f31930z.d().addAll(list);
                PictureImageGridAdapter pictureImageGridAdapter = this.f31930z;
                pictureImageGridAdapter.notifyItemRangeChanged(size, pictureImageGridAdapter.getItemCount());
                R1();
            } else {
                a();
            }
            if (list.size() < 10) {
                RecyclerPreloadView recyclerPreloadView = this.f31918n;
                recyclerPreloadView.onScrolled(recyclerPreloadView.getScrollX(), this.f31918n.getScrollY());
            }
        }
    }

    public final void O1(List<LocalMediaFolder> list) {
        LocalMediaFolder localMediaFolderJ;
        if (o8.a.c(getActivity())) {
            return;
        }
        if (list.size() > 0) {
            if (j8.a.j() != null) {
                localMediaFolderJ = j8.a.j();
            } else {
                localMediaFolderJ = list.get(0);
                j8.a.p(localMediaFolderJ);
            }
            this.f31920p.setTitle(localMediaFolderJ.h());
            this.A.c(list);
            if (this.f32146f.f32209f0) {
                L1(new ArrayList<>(j8.a.k()), true);
                return;
            } else {
                m2(localMediaFolderJ.e());
                return;
            }
        }
        q2();
    }

    public final void P1(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (o8.a.c(getActivity())) {
            return;
        }
        this.f31918n.setEnabledLoadMore(z10);
        if (arrayList.size() == 0) {
            this.f31930z.d().clear();
        }
        m2(arrayList);
        this.f31918n.onScrolled(0, 0);
        this.f31918n.smoothScrollToPosition(0);
    }

    public final void S1() {
        b8.a aVarD = b8.a.d(getContext());
        this.A = aVarD;
        aVarD.l(new r());
        G1();
    }

    public final void f2(int i10, boolean z10) {
        ArrayList<LocalMedia> arrayList;
        int i11;
        long jC;
        int i12;
        FragmentActivity activity = getActivity();
        String str = PictureSelectorPreviewFragment.Q;
        if (o8.a.b(activity, str)) {
            if (z10) {
                ArrayList<LocalMedia> arrayList2 = new ArrayList<>(j8.a.n());
                jC = 0;
                arrayList = arrayList2;
                i11 = arrayList2.size();
            } else {
                arrayList = new ArrayList<>(this.f31930z.d());
                i11 = j8.a.j().i();
                jC = j8.a.j().c();
            }
            if (!z10) {
                PictureSelectionConfig pictureSelectionConfig = this.f32146f;
                if (pictureSelectionConfig.M) {
                    RecyclerPreloadView recyclerPreloadView = this.f31918n;
                    if (pictureSelectionConfig.L) {
                        i12 = 0;
                    } else {
                        i12 = o8.e.i(getContext());
                    }
                    i8.a.c(recyclerPreloadView, i12);
                }
            }
            f8.r rVar = PictureSelectionConfig.f32184c1;
            if (rVar != null) {
                rVar.a(getContext(), i10, i11, this.f32144d, jC, this.f31920p.getTitleText(), this.f31930z.g(), arrayList, z10);
            } else if (o8.a.b(getActivity(), str)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragmentP1 = PictureSelectorPreviewFragment.P1();
                pictureSelectorPreviewFragmentP1.e2(z10, this.f31920p.getTitleText(), this.f31930z.g(), i10, i11, this.f32144d, jC, arrayList);
                z7.a.a(getActivity(), str, pictureSelectorPreviewFragmentP1);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void h0() {
        G0(requireView());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void m2(ArrayList<LocalMedia> arrayList) {
        long jL = L();
        if (jL > 0) {
            requireView().postDelayed(new l(arrayList), jL);
        } else {
            n2(arrayList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SlideSelectTouchListener slideSelectTouchListener = this.B;
        if (slideSelectTouchListener != null) {
            slideSelectTouchListener.q();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.luck.picture.lib.all_folder_size", this.f31925u);
        bundle.putInt("com.luck.picture.lib.current_page", this.f32144d);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f31918n.getLastVisiblePosition());
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f31930z.g());
        j8.a.p(j8.a.j());
        j8.a.a(this.A.f());
        j8.a.b(this.f31930z.d());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        boolean z10;
        super.onViewCreated(view, bundle);
        h2(bundle);
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31928x = z10;
        this.f31919o = (TextView) view.findViewById(R$id.tv_data_empty);
        this.f31922r = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f31920p = (TitleBar) view.findViewById(R$id.title_bar);
        this.f31921q = (BottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f31923s = (TextView) view.findViewById(R$id.tv_current_data_time);
        e2();
        S1();
        W1();
        U1();
        V1(view);
        T1();
        if (this.f31928x) {
            i2();
        } else {
            l2();
        }
    }

    public final void q2() {
        int i10;
        if (j8.a.j() == null || j8.a.j().c() == -1) {
            if (this.f31919o.getVisibility() == 8) {
                this.f31919o.setVisibility(0);
            }
            this.f31919o.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_no_data, 0, 0);
            if (this.f32146f.f32200b == a8.e.b()) {
                i10 = R$string.ps_audio_empty;
            } else {
                i10 = R$string.ps_empty;
            }
            this.f31919o.setText(getString(i10));
        }
    }
}
