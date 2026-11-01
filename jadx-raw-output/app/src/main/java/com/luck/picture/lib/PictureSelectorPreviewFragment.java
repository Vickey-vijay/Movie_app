package com.luck.picture.lib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.luck.picture.lib.adapter.PicturePreviewAdapter;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.decoration.HorizontalItemDecoration;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.magical.MagicalView;
import com.luck.picture.lib.magical.ViewParams;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.PreviewBottomNavBar;
import com.luck.picture.lib.widget.PreviewTitleBar;
import com.luck.picture.lib.widget.TitleBar;
import f8.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PictureSelectorPreviewFragment extends PictureCommonFragment {
    public static final String Q = PictureSelectorPreviewFragment.class.getSimpleName();
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public TextView G;
    public TextView H;
    public View I;
    public CompleteSelectView J;
    public RecyclerView M;
    public PreviewGalleryAdapter N;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MagicalView f31961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPager2 f31962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PicturePreviewAdapter f31963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PreviewBottomNavBar f31964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PreviewTitleBar f31965s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f31970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31971y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f31972z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<LocalMedia> f31960n = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f31966t = true;
    public long F = -1;
    public boolean K = true;
    public boolean L = false;
    public List<View> O = new ArrayList();
    public final ViewPager2.OnPageChangeCallback P = new n();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment.this.I.performClick();
        }
    }

    public class a0 implements View.OnClickListener {
        public a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f31972z) {
                pictureSelectorPreviewFragment.y1();
                return;
            }
            LocalMedia localMedia = pictureSelectorPreviewFragment.f31960n.get(pictureSelectorPreviewFragment.f31962p.getCurrentItem());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment2.u(localMedia, pictureSelectorPreviewFragment2.G.isSelected()) == 0) {
                c0 c0Var = PictureSelectionConfig.f32196o1;
                if (c0Var != null) {
                    c0Var.a(PictureSelectorPreviewFragment.this.G);
                } else {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                    pictureSelectorPreviewFragment3.G.startAnimation(AnimationUtils.loadAnimation(pictureSelectorPreviewFragment3.getContext(), R$anim.ps_anim_modal_in));
                }
            }
        }
    }

    public class b extends WrapContentLinearLayoutManager {

        public class a extends LinearSmoothScroller {
            public a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 300.0f / displayMetrics.densityDpi;
            }
        }

        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
            super.smoothScrollToPosition(recyclerView, state, i10);
            a aVar = new a(recyclerView.getContext());
            aVar.setTargetPosition(i10);
            startSmoothScroll(aVar);
        }
    }

    public class b0 implements BasePreviewHolder.a {
        public b0() {
        }

        public /* synthetic */ b0(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, k kVar) {
            this();
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.a
        public void a(LocalMedia localMedia) {
            if (PictureSelectorPreviewFragment.this.f32146f.P) {
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f31972z) {
                pictureSelectorPreviewFragment.U1(localMedia);
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.a
        public void onBackPressed() {
            if (PictureSelectorPreviewFragment.this.f32146f.L) {
                PictureSelectorPreviewFragment.this.b2();
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f31972z) {
                if (pictureSelectorPreviewFragment.f32146f.M) {
                    PictureSelectorPreviewFragment.this.f31961o.t();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.D1();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.f31968v || !pictureSelectorPreviewFragment.f32146f.M) {
                PictureSelectorPreviewFragment.this.X();
            } else {
                PictureSelectorPreviewFragment.this.f31961o.t();
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.a
        public void b(String str) {
            if (TextUtils.isEmpty(str)) {
                PictureSelectorPreviewFragment.this.f31965s.setTitle((PictureSelectorPreviewFragment.this.f31967u + 1) + "/" + PictureSelectorPreviewFragment.this.C);
                return;
            }
            PictureSelectorPreviewFragment.this.f31965s.setTitle(str);
        }
    }

    public class c implements PreviewGalleryAdapter.c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f31979b;

            public a(int i10) {
                this.f31979b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PictureSelectorPreviewFragment.this.f32146f.M) {
                    PictureSelectorPreviewFragment.this.f31963q.m(this.f31979b);
                }
            }
        }

        public c() {
        }

        @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.c
        public void a(int i10, LocalMedia localMedia, View view) {
            String string = TextUtils.isEmpty(PictureSelectorPreviewFragment.this.f32146f.f32205d0) ? PictureSelectorPreviewFragment.this.getString(R$string.ps_camera_roll) : PictureSelectorPreviewFragment.this.f32146f.f32205d0;
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f31968v || TextUtils.equals(pictureSelectorPreviewFragment.f31970x, string) || TextUtils.equals(localMedia.v(), PictureSelectorPreviewFragment.this.f31970x)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                if (!pictureSelectorPreviewFragment2.f31968v) {
                    i10 = pictureSelectorPreviewFragment2.f31971y ? localMedia.f32272n - 1 : localMedia.f32272n;
                }
                if (i10 == pictureSelectorPreviewFragment2.f31962p.getCurrentItem() && localMedia.E()) {
                    return;
                }
                LocalMedia localMediaD = PictureSelectorPreviewFragment.this.f31963q.d(i10);
                if ((localMediaD == null || TextUtils.equals(localMedia.w(), localMediaD.w())) && localMedia.r() == localMediaD.r()) {
                    if (PictureSelectorPreviewFragment.this.f31962p.getAdapter() != null) {
                        PictureSelectorPreviewFragment.this.f31962p.setAdapter(null);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                        pictureSelectorPreviewFragment3.f31962p.setAdapter(pictureSelectorPreviewFragment3.f31963q);
                    }
                    PictureSelectorPreviewFragment.this.f31962p.setCurrentItem(i10, false);
                    PictureSelectorPreviewFragment.this.Q1(localMedia);
                    PictureSelectorPreviewFragment.this.f31962p.post(new a(i10));
                }
            }
        }
    }

    public class d extends ItemTouchHelper.Callback {

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.L = true;
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.K = true;
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        }

        public d() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            int iH;
            viewHolder.itemView.setAlpha(1.0f);
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.L) {
                pictureSelectorPreviewFragment.L = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.1f, 1.0f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.1f, 1.0f));
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.setDuration(50L);
                animatorSet.start();
                animatorSet.addListener(new b());
            }
            super.clearView(recyclerView, viewHolder);
            PictureSelectorPreviewFragment.this.N.notifyItemChanged(viewHolder.getAbsoluteAdapterPosition());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment2.f31968v && PictureSelectorPreviewFragment.this.f31962p.getCurrentItem() != (iH = pictureSelectorPreviewFragment2.N.h()) && iH != -1) {
                if (PictureSelectorPreviewFragment.this.f31962p.getAdapter() != null) {
                    PictureSelectorPreviewFragment.this.f31962p.setAdapter(null);
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                    pictureSelectorPreviewFragment3.f31962p.setAdapter(pictureSelectorPreviewFragment3.f31963q);
                }
                PictureSelectorPreviewFragment.this.f31962p.setCurrentItem(iH, false);
            }
            if (!PictureSelectionConfig.T0.c().Y() || o8.a.c(PictureSelectorPreviewFragment.this.getActivity())) {
                return;
            }
            List<Fragment> fragments = PictureSelectorPreviewFragment.this.getActivity().getSupportFragmentManager().getFragments();
            for (int i10 = 0; i10 < fragments.size(); i10++) {
                Fragment fragment = fragments.get(i10);
                if (fragment instanceof PictureCommonFragment) {
                    ((PictureCommonFragment) fragment).z0(true);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(0.7f);
            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.K) {
                pictureSelectorPreviewFragment.K = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.0f, 1.1f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.0f, 1.1f));
                animatorSet.setDuration(50L);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.start();
                animatorSet.addListener(new a());
            }
            super.onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i10, float f10, float f11) {
            return super.getAnimationDuration(recyclerView, i10, f10, f11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            try {
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                    int i10 = absoluteAdapterPosition;
                    while (i10 < absoluteAdapterPosition2) {
                        int i11 = i10 + 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.N.g(), i10, i11);
                        Collections.swap(j8.a.n(), i10, i11);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                        if (pictureSelectorPreviewFragment.f31968v) {
                            Collections.swap(pictureSelectorPreviewFragment.f31960n, i10, i11);
                        }
                        i10 = i11;
                    }
                } else {
                    for (int i12 = absoluteAdapterPosition; i12 > absoluteAdapterPosition2; i12--) {
                        int i13 = i12 - 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.N.g(), i12, i13);
                        Collections.swap(j8.a.n(), i12, i13);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                        if (pictureSelectorPreviewFragment2.f31968v) {
                            Collections.swap(pictureSelectorPreviewFragment2.f31960n, i12, i13);
                        }
                    }
                }
                PictureSelectorPreviewFragment.this.N.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                return true;
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i10) {
            super.onSelectedChanged(viewHolder, i10);
        }
    }

    public class e implements PreviewGalleryAdapter.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ItemTouchHelper f31984a;

        public e(ItemTouchHelper itemTouchHelper) {
            this.f31984a = itemTouchHelper;
        }

        @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.d
        public void a(RecyclerView.ViewHolder viewHolder, int i10, View view) {
            ((Vibrator) PictureSelectorPreviewFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            if (PictureSelectorPreviewFragment.this.N.getItemCount() != PictureSelectorPreviewFragment.this.f32146f.f32220l) {
                this.f31984a.startDrag(viewHolder);
            } else if (viewHolder.getLayoutPosition() != PictureSelectorPreviewFragment.this.N.getItemCount() - 1) {
                this.f31984a.startDrag(viewHolder);
            }
        }
    }

    public class f extends BottomNavBar.b {
        public f() {
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void a() {
            PictureSelectorPreviewFragment.this.C0();
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void b() {
            if (PictureSelectionConfig.Z0 != null) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                PictureSelectionConfig.Z0.a(PictureSelectorPreviewFragment.this, pictureSelectorPreviewFragment.f31960n.get(pictureSelectorPreviewFragment.f31962p.getCurrentItem()), 696);
            }
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void c() {
            int currentItem = PictureSelectorPreviewFragment.this.f31962p.getCurrentItem();
            if (PictureSelectorPreviewFragment.this.f31960n.size() > currentItem) {
                PictureSelectorPreviewFragment.this.u(PictureSelectorPreviewFragment.this.f31960n.get(currentItem), false);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.f31963q.j(pictureSelectorPreviewFragment.f31967u);
        }
    }

    public class h implements f8.d<int[]> {
        public h() {
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.j2(iArr);
        }
    }

    public class i implements f8.d<int[]> {
        public i() {
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.j2(iArr);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f31990b;

        public j(int[] iArr) {
            this.f31990b = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            MagicalView magicalView = PictureSelectorPreviewFragment.this.f31961o;
            int[] iArr = this.f31990b;
            magicalView.K(iArr[0], iArr[1], false);
        }
    }

    public class k implements i8.c {
        public k() {
        }

        @Override // i8.c
        public void a(boolean z10) {
            PictureSelectorPreviewFragment.this.Z1(z10);
        }

        @Override // i8.c
        public void b(MagicalView magicalView, boolean z10) {
            PictureSelectorPreviewFragment.this.X1(magicalView, z10);
        }

        @Override // i8.c
        public void c() {
            PictureSelectorPreviewFragment.this.a2();
        }

        @Override // i8.c
        public void d(float f10) {
            PictureSelectorPreviewFragment.this.W1(f10);
        }

        @Override // i8.c
        public void e() {
            PictureSelectorPreviewFragment.this.Y1();
        }
    }

    public class l extends AnimatorListenerAdapter {
        public l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PictureSelectorPreviewFragment.this.B = false;
        }
    }

    public class m implements b8.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f31994a;

        public class a implements f8.d<String> {
            public a() {
            }

            @Override // f8.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                String string;
                PictureSelectorPreviewFragment.this.E();
                if (TextUtils.isEmpty(str)) {
                    if (a8.d.d(m.this.f31994a.s())) {
                        string = PictureSelectorPreviewFragment.this.getString(R$string.ps_save_audio_error);
                    } else {
                        string = a8.d.i(m.this.f31994a.s()) ? PictureSelectorPreviewFragment.this.getString(R$string.ps_save_video_error) : PictureSelectorPreviewFragment.this.getString(R$string.ps_save_image_error);
                    }
                    o8.r.c(PictureSelectorPreviewFragment.this.getContext(), string);
                    return;
                }
                new z7.g(PictureSelectorPreviewFragment.this.getActivity(), str);
                o8.r.c(PictureSelectorPreviewFragment.this.getContext(), PictureSelectorPreviewFragment.this.getString(R$string.ps_save_success) + "\n" + str);
            }
        }

        public m(LocalMedia localMedia) {
            this.f31994a = localMedia;
        }

        @Override // b8.b.a
        public void a() {
            String strF = this.f31994a.f();
            if (a8.d.g(strF)) {
                PictureSelectorPreviewFragment.this.I0();
            }
            o8.g.a(PictureSelectorPreviewFragment.this.getContext(), strF, this.f31994a.s(), new a());
        }
    }

    public class n extends ViewPager2.OnPageChangeCallback {
        public n() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            if (PictureSelectorPreviewFragment.this.f31960n.size() > i10) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                int i12 = pictureSelectorPreviewFragment.D / 2;
                ArrayList<LocalMedia> arrayList = pictureSelectorPreviewFragment.f31960n;
                if (i11 >= i12) {
                    i10++;
                }
                LocalMedia localMedia = arrayList.get(i10);
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                pictureSelectorPreviewFragment2.G.setSelected(pictureSelectorPreviewFragment2.N1(localMedia));
                PictureSelectorPreviewFragment.this.Q1(localMedia);
                PictureSelectorPreviewFragment.this.S1(localMedia);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.f31967u = i10;
            pictureSelectorPreviewFragment.f31965s.setTitle((PictureSelectorPreviewFragment.this.f31967u + 1) + "/" + PictureSelectorPreviewFragment.this.C);
            if (PictureSelectorPreviewFragment.this.f31960n.size() > i10) {
                LocalMedia localMedia = PictureSelectorPreviewFragment.this.f31960n.get(i10);
                PictureSelectorPreviewFragment.this.S1(localMedia);
                if (PictureSelectorPreviewFragment.this.M1()) {
                    PictureSelectorPreviewFragment.this.v1(i10);
                }
                if (PictureSelectorPreviewFragment.this.f32146f.M) {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment2.f31968v && pictureSelectorPreviewFragment2.f32146f.C0) {
                        PictureSelectorPreviewFragment.this.k2(i10);
                    } else {
                        PictureSelectorPreviewFragment.this.f31963q.m(i10);
                    }
                } else if (PictureSelectorPreviewFragment.this.f32146f.C0) {
                    PictureSelectorPreviewFragment.this.k2(i10);
                }
                PictureSelectorPreviewFragment.this.Q1(localMedia);
                PictureSelectorPreviewFragment.this.f31964r.i(a8.d.i(localMedia.s()) || a8.d.d(localMedia.s()));
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment3.f31972z || pictureSelectorPreviewFragment3.f31968v || pictureSelectorPreviewFragment3.f32146f.f32229p0 || !PictureSelectorPreviewFragment.this.f32146f.f32209f0) {
                    return;
                }
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment4 = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment4.f31966t) {
                    if (i10 == (pictureSelectorPreviewFragment4.f31963q.getItemCount() - 1) - 10 || i10 == PictureSelectorPreviewFragment.this.f31963q.getItemCount() - 1) {
                        PictureSelectorPreviewFragment.this.O1();
                    }
                }
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f31998b;

        public o(int i10) {
            this.f31998b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorPreviewFragment.this.f31963q.n(this.f31998b);
        }
    }

    public class p implements f8.d<int[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32000a;

        public p(int i10) {
            this.f32000a = i10;
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.h2(iArr[0], iArr[1], this.f32000a);
        }
    }

    public class q implements f8.d<int[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32002a;

        public q(int i10) {
            this.f32002a = i10;
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.h2(iArr[0], iArr[1], this.f32002a);
        }
    }

    public class r implements f8.d<d8.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f8.d f32005b;

        public r(LocalMedia localMedia, f8.d dVar) {
            this.f32004a = localMedia;
            this.f32005b = dVar;
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d8.b bVar) {
            if (bVar.c() > 0) {
                this.f32004a.w0(bVar.c());
            }
            if (bVar.b() > 0) {
                this.f32004a.h0(bVar.b());
            }
            f8.d dVar = this.f32005b;
            if (dVar != null) {
                dVar.a(new int[]{this.f32004a.D(), this.f32004a.q()});
            }
        }
    }

    public class s implements f8.d<d8.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f8.d f32008b;

        public s(LocalMedia localMedia, f8.d dVar) {
            this.f32007a = localMedia;
            this.f32008b = dVar;
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d8.b bVar) {
            if (bVar.c() > 0) {
                this.f32007a.w0(bVar.c());
            }
            if (bVar.b() > 0) {
                this.f32007a.h0(bVar.b());
            }
            f8.d dVar = this.f32008b;
            if (dVar != null) {
                dVar.a(new int[]{this.f32007a.D(), this.f32007a.q()});
            }
        }
    }

    public class t implements f8.d<int[]> {
        public t() {
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.w1(iArr);
        }
    }

    public class u implements f8.d<int[]> {
        public u() {
        }

        @Override // f8.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.w1(iArr);
        }
    }

    public class v extends f8.u<LocalMedia> {
        public v() {
        }

        @Override // f8.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorPreviewFragment.this.E1(arrayList, z10);
        }
    }

    public class w extends f8.u<LocalMedia> {
        public w() {
        }

        @Override // f8.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorPreviewFragment.this.E1(arrayList, z10);
        }
    }

    public class x implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SelectMainStyle f32014b;

        public x(SelectMainStyle selectMainStyle) {
            this.f32014b = selectMainStyle;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0027  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            if (this.f32014b.T() && j8.a.l() == 0) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment.u(pictureSelectorPreviewFragment.f31960n.get(pictureSelectorPreviewFragment.f31962p.getCurrentItem()), false) != 0) {
                    z10 = false;
                }
            } else if (j8.a.l() <= 0) {
                z10 = false;
            }
            if (PictureSelectorPreviewFragment.this.f32146f.O && j8.a.l() == 0) {
                PictureSelectorPreviewFragment.this.f0();
            } else if (z10) {
                PictureSelectorPreviewFragment.this.H();
            }
        }
    }

    public class y extends TitleBar.a {
        public y() {
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void a() {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f31972z) {
                if (pictureSelectorPreviewFragment.f32146f.M) {
                    PictureSelectorPreviewFragment.this.f31961o.t();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.D1();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.f31968v || !pictureSelectorPreviewFragment.f32146f.M) {
                PictureSelectorPreviewFragment.this.X();
            } else {
                PictureSelectorPreviewFragment.this.f31961o.t();
            }
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment.this.y1();
        }
    }

    public final void C1(LocalMedia localMedia, boolean z10, f8.d<int[]> dVar) {
        boolean z11;
        if (!z10 || ((localMedia.D() > 0 && localMedia.q() > 0 && localMedia.D() <= localMedia.q()) || !this.f32146f.H0)) {
            z11 = true;
        } else {
            this.f31962p.setAlpha(0.0f);
            o8.j.m(getContext(), localMedia.f(), new s(localMedia, dVar));
            z11 = false;
        }
        if (z11) {
            dVar.a(new int[]{localMedia.D(), localMedia.q()});
        }
    }

    public final void F1() {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            this.O.get(i10).setEnabled(true);
        }
        this.f31964r.getEditor().setEnabled(true);
    }

    public void W1(float f10) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            if (!(this.O.get(i10) instanceof TitleBar)) {
                this.O.get(i10).setAlpha(f10);
            }
        }
    }

    public final void i2() {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            this.O.get(i10).setEnabled(false);
        }
        this.f31964r.getEditor().setEnabled(false);
    }

    public static PictureSelectorPreviewFragment P1() {
        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = new PictureSelectorPreviewFragment();
        pictureSelectorPreviewFragment.setArguments(new Bundle());
        return pictureSelectorPreviewFragment;
    }

    public String A1() {
        return Q;
    }

    public final void H1() {
        this.f31964r.f();
        this.f31964r.h();
        this.f31964r.setOnBottomNavBarListener(new f());
    }

    public final void I1() {
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        if (o8.q.c(selectMainStyleC.D())) {
            this.G.setBackgroundResource(selectMainStyleC.D());
        } else if (o8.q.c(selectMainStyleC.I())) {
            this.G.setBackgroundResource(selectMainStyleC.I());
        }
        if (o8.q.f(selectMainStyleC.F())) {
            this.H.setText(selectMainStyleC.F());
        } else {
            this.H.setText("");
        }
        if (o8.q.b(selectMainStyleC.H())) {
            this.H.setTextSize(selectMainStyleC.H());
        }
        if (o8.q.c(selectMainStyleC.G())) {
            this.H.setTextColor(selectMainStyleC.G());
        }
        if (o8.q.b(selectMainStyleC.E())) {
            if (this.G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                if (this.G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.G.getLayoutParams())).rightMargin = selectMainStyleC.E();
                }
            } else if (this.G.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.G.getLayoutParams()).rightMargin = selectMainStyleC.E();
            }
        }
        this.J.c();
        this.J.setSelectedChange(true);
        if (selectMainStyleC.T()) {
            if (this.J.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.J.getLayoutParams();
                int i10 = R$id.title_bar;
                layoutParams.topToTop = i10;
                ((ConstraintLayout.LayoutParams) this.J.getLayoutParams()).bottomToBottom = i10;
                if (this.f32146f.L) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.J.getLayoutParams())).topMargin = o8.e.i(getContext());
                }
            } else if ((this.J.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f32146f.L) {
                ((RelativeLayout.LayoutParams) this.J.getLayoutParams()).topMargin = o8.e.i(getContext());
            }
        }
        if (selectMainStyleC.X()) {
            if (this.G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.G.getLayoutParams();
                int i11 = R$id.bottom_nar_bar;
                layoutParams2.topToTop = i11;
                ((ConstraintLayout.LayoutParams) this.G.getLayoutParams()).bottomToBottom = i11;
                ((ConstraintLayout.LayoutParams) this.H.getLayoutParams()).topToTop = i11;
                ((ConstraintLayout.LayoutParams) this.H.getLayoutParams()).bottomToBottom = i11;
                ((ConstraintLayout.LayoutParams) this.I.getLayoutParams()).topToTop = i11;
                ((ConstraintLayout.LayoutParams) this.I.getLayoutParams()).bottomToBottom = i11;
            }
        } else if (this.f32146f.L) {
            if (this.H.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.H.getLayoutParams())).topMargin = o8.e.i(getContext());
            } else if (this.H.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.H.getLayoutParams()).topMargin = o8.e.i(getContext());
            }
        }
        this.J.setOnClickListener(new x(selectMainStyleC));
    }

    public void J1(ViewGroup viewGroup) {
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        if (selectMainStyleC.V()) {
            this.M = new RecyclerView(getContext());
            if (o8.q.c(selectMainStyleC.p())) {
                this.M.setBackgroundResource(selectMainStyleC.p());
            } else {
                this.M.setBackgroundResource(R$drawable.ps_preview_gallery_bg);
            }
            viewGroup.addView(this.M);
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.bottomToTop = R$id.bottom_nar_bar;
                layoutParams2.startToStart = 0;
                layoutParams2.endToEnd = 0;
            }
            b bVar = new b(getContext());
            RecyclerView.ItemAnimator itemAnimator = this.M.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
            if (this.M.getItemDecorationCount() == 0) {
                this.M.addItemDecoration(new HorizontalItemDecoration(Integer.MAX_VALUE, o8.e.a(getContext(), 6.0f)));
            }
            bVar.setOrientation(0);
            this.M.setLayoutManager(bVar);
            if (j8.a.l() > 0) {
                this.M.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R$anim.ps_anim_layout_fall_enter));
            }
            this.N = new PreviewGalleryAdapter(this.f31968v, j8.a.n());
            Q1(this.f31960n.get(this.f31967u));
            this.M.setAdapter(this.N);
            this.N.m(new c());
            if (j8.a.l() > 0) {
                this.M.setVisibility(0);
            } else {
                this.M.setVisibility(4);
            }
            u1(this.M);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new d());
            itemTouchHelper.attachToRecyclerView(this.M);
            this.N.n(new e(itemTouchHelper));
        }
    }

    public final void K1() {
        if (PictureSelectionConfig.T0.d().u()) {
            this.f31965s.setVisibility(8);
        }
        this.f31965s.d();
        this.f31965s.setOnTitleBarListener(new y());
        this.f31965s.setTitle((this.f31967u + 1) + "/" + this.C);
        this.f31965s.getImageDelete().setOnClickListener(new z());
        this.I.setOnClickListener(new a0());
        this.G.setOnClickListener(new a());
    }

    public final boolean M1() {
        return !this.f31968v && this.f32146f.M;
    }

    public final void O1() {
        int i10 = this.f32144d + 1;
        this.f32144d = i10;
        c8.e eVar = PictureSelectionConfig.R0;
        if (eVar == null) {
            this.f32145e.h(this.F, i10, this.f32146f.f32207e0, new w());
            return;
        }
        Context context = getContext();
        long j10 = this.F;
        int i11 = this.f32144d;
        int i12 = this.f32146f.f32207e0;
        eVar.b(context, j10, i11, i12, i12, new v());
    }

    public final void Q1(LocalMedia localMedia) {
        if (this.N == null || !PictureSelectionConfig.T0.c().V()) {
            return;
        }
        this.N.i(localMedia);
    }

    public final void R1(boolean z10, LocalMedia localMedia) {
        if (this.N == null || !PictureSelectionConfig.T0.c().V()) {
            return;
        }
        if (this.M.getVisibility() == 4) {
            this.M.setVisibility(0);
        }
        if (z10) {
            if (this.f32146f.f32218k == 1) {
                this.N.clear();
            }
            this.N.e(localMedia);
            this.M.smoothScrollToPosition(this.N.getItemCount() - 1);
            return;
        }
        this.N.l(localMedia);
        if (j8.a.l() == 0) {
            this.M.setVisibility(4);
        }
    }

    public void S1(LocalMedia localMedia) {
        if (PictureSelectionConfig.T0.c().W() && PictureSelectionConfig.T0.c().Y()) {
            this.G.setText("");
            for (int i10 = 0; i10 < j8.a.l(); i10++) {
                LocalMedia localMedia2 = j8.a.n().get(i10);
                if (TextUtils.equals(localMedia2.w(), localMedia.w()) || localMedia2.r() == localMedia.r()) {
                    localMedia.l0(localMedia2.t());
                    localMedia2.q0(localMedia.x());
                    this.G.setText(o8.s.g(Integer.valueOf(localMedia.t())));
                }
            }
        }
    }

    public void T1() {
        if (this.f31972z) {
            return;
        }
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

    public final void U1(LocalMedia localMedia) {
        String string;
        f8.g gVar = PictureSelectionConfig.X0;
        if (gVar == null || gVar.a(localMedia)) {
            return;
        }
        if (a8.d.d(localMedia.s()) || a8.d.l(localMedia.f())) {
            string = getString(R$string.ps_prompt_audio_content);
        } else {
            string = (a8.d.i(localMedia.s()) || a8.d.o(localMedia.f())) ? getString(R$string.ps_prompt_video_content) : getString(R$string.ps_prompt_image_content);
        }
        b8.b.c(getContext(), getString(R$string.ps_prompt), string).b(new m(localMedia));
    }

    public void X1(MagicalView magicalView, boolean z10) {
        int iD;
        int iQ;
        BasePreviewHolder basePreviewHolderC = this.f31963q.c(this.f31962p.getCurrentItem());
        if (basePreviewHolderC == null) {
            return;
        }
        LocalMedia localMedia = this.f31960n.get(this.f31962p.getCurrentItem());
        if (!localMedia.G() || localMedia.k() <= 0 || localMedia.j() <= 0) {
            iD = localMedia.D();
            iQ = localMedia.q();
        } else {
            iD = localMedia.k();
            iQ = localMedia.j();
        }
        if (o8.j.n(iD, iQ)) {
            basePreviewHolderC.f32059q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            basePreviewHolderC.f32059q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderC;
            if (this.f32146f.C0) {
                k2(this.f31962p.getCurrentItem());
            } else {
                if (previewVideoHolder.f32123s.getVisibility() != 8 || this.f31963q.e(this.f31962p.getCurrentItem())) {
                    return;
                }
                previewVideoHolder.f32123s.setVisibility(0);
            }
        }
    }

    public void Y1() {
        BasePreviewHolder basePreviewHolderC = this.f31963q.c(this.f31962p.getCurrentItem());
        if (basePreviewHolderC == null) {
            return;
        }
        if (basePreviewHolderC.f32059q.getVisibility() == 8) {
            basePreviewHolderC.f32059q.setVisibility(0);
        }
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderC;
            if (previewVideoHolder.f32123s.getVisibility() == 0) {
                previewVideoHolder.f32123s.setVisibility(8);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void Z() {
        this.f31964r.g();
    }

    public void Z1(boolean z10) {
        BasePreviewHolder basePreviewHolderC;
        ViewParams viewParamsD = i8.a.d(this.f31971y ? this.f31967u + 1 : this.f31967u);
        if (viewParamsD == null || (basePreviewHolderC = this.f31963q.c(this.f31962p.getCurrentItem())) == null) {
            return;
        }
        basePreviewHolderC.f32059q.getLayoutParams().width = viewParamsD.f32326d;
        basePreviewHolderC.f32059q.getLayoutParams().height = viewParamsD.f32327e;
        basePreviewHolderC.f32059q.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public void a2() {
        if (this.f31972z && U() && M1()) {
            f0();
        } else {
            X();
        }
    }

    public final void b2() {
        if (this.B) {
            return;
        }
        boolean z10 = this.f31965s.getTranslationY() == 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        float f10 = z10 ? 0.0f : -this.f31965s.getHeight();
        float f11 = z10 ? -this.f31965s.getHeight() : 0.0f;
        float f12 = z10 ? 1.0f : 0.0f;
        float f13 = z10 ? 0.0f : 1.0f;
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            View view = this.O.get(i10);
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", f12, f13));
            if (view instanceof TitleBar) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", f10, f11));
            }
        }
        animatorSet.setDuration(350L);
        animatorSet.start();
        this.B = true;
        animatorSet.addListener(new l());
        if (z10) {
            i2();
        } else {
            F1();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void c0(Intent intent) {
        if (this.f31960n.size() > this.f31962p.getCurrentItem()) {
            LocalMedia localMedia = this.f31960n.get(this.f31962p.getCurrentItem());
            Uri uriB = a8.a.b(intent);
            localMedia.b0(uriB != null ? uriB.getPath() : "");
            localMedia.V(a8.a.h(intent));
            localMedia.U(a8.a.e(intent));
            localMedia.W(a8.a.f(intent));
            localMedia.X(a8.a.g(intent));
            localMedia.Y(a8.a.c(intent));
            localMedia.a0(!TextUtils.isEmpty(localMedia.m()));
            localMedia.Z(a8.a.d(intent));
            localMedia.e0(localMedia.G());
            localMedia.s0(localMedia.m());
            if (j8.a.n().contains(localMedia)) {
                LocalMedia localMediaH = localMedia.h();
                if (localMediaH != null) {
                    localMediaH.b0(localMedia.m());
                    localMediaH.a0(localMedia.G());
                    localMediaH.e0(localMedia.H());
                    localMediaH.Z(localMedia.l());
                    localMediaH.s0(localMedia.m());
                    localMediaH.V(a8.a.h(intent));
                    localMediaH.U(a8.a.e(intent));
                    localMediaH.W(a8.a.f(intent));
                    localMediaH.X(a8.a.g(intent));
                    localMediaH.Y(a8.a.c(intent));
                }
                A0(localMedia);
            } else {
                u(localMedia, false);
            }
            this.f31963q.notifyItemChanged(this.f31962p.getCurrentItem());
            Q1(localMedia);
        }
    }

    public void c2(Bundle bundle) {
        if (bundle != null) {
            this.f32144d = bundle.getInt("com.luck.picture.lib.current_page", 1);
            this.F = bundle.getLong("com.luck.picture.lib.current_bucketId", -1L);
            this.f31967u = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f31967u);
            this.f31971y = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f31971y);
            this.C = bundle.getInt("com.luck.picture.lib.current_album_total", this.C);
            this.f31972z = bundle.getBoolean("com.luck.picture.lib.external_preview", this.f31972z);
            this.A = bundle.getBoolean("com.luck.picture.lib.external_preview_display_delete", this.A);
            this.f31968v = bundle.getBoolean("com.luck.picture.lib.bottom_preview", this.f31968v);
            this.f31970x = bundle.getString("com.luck.picture.lib.current_album_name", "");
            if (this.f31960n.size() == 0) {
                this.f31960n.addAll(new ArrayList(j8.a.m()));
            }
        }
    }

    public void d2(int i10, int i11, ArrayList<LocalMedia> arrayList, boolean z10) {
        this.f31960n = arrayList;
        this.C = i11;
        this.f31967u = i10;
        this.A = z10;
        this.f31972z = true;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void e0() {
        if (this.f32146f.L) {
            F1();
        }
    }

    public void e2(boolean z10, String str, boolean z11, int i10, int i11, int i12, long j10, ArrayList<LocalMedia> arrayList) {
        this.f32144d = i12;
        this.F = j10;
        this.f31960n = arrayList;
        this.C = i11;
        this.f31967u = i10;
        this.f31970x = str;
        this.f31971y = z11;
        this.f31968v = z10;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void f0() {
        PicturePreviewAdapter picturePreviewAdapter = this.f31963q;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        super.f0();
    }

    public final void g2() {
        ArrayList<LocalMedia> arrayList;
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        if (o8.q.c(selectMainStyleC.C())) {
            this.f31961o.setBackgroundColor(selectMainStyleC.C());
            return;
        }
        if (this.f32146f.f32200b == a8.e.b() || ((arrayList = this.f31960n) != null && arrayList.size() > 0 && a8.d.d(this.f31960n.get(0).s()))) {
            this.f31961o.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_white));
        } else {
            this.f31961o.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_black));
        }
    }

    public final void h2(int i10, int i11, int i12) {
        this.f31961o.A(i10, i11, true);
        if (this.f31971y) {
            i12++;
        }
        ViewParams viewParamsD = i8.a.d(i12);
        if (viewParamsD == null || i10 == 0 || i11 == 0) {
            this.f31961o.F(0, 0, 0, 0, i10, i11);
        } else {
            this.f31961o.F(viewParamsD.f32324b, viewParamsD.f32325c, viewParamsD.f32326d, viewParamsD.f32327e, i10, i11);
        }
    }

    public final void j2(int[] iArr) {
        int i10;
        this.f31961o.A(iArr[0], iArr[1], false);
        ViewParams viewParamsD = i8.a.d(this.f31971y ? this.f31967u + 1 : this.f31967u);
        if (viewParamsD == null || ((i10 = iArr[0]) == 0 && iArr[1] == 0)) {
            this.f31962p.post(new j(iArr));
            this.f31961o.setBackgroundAlpha(1.0f);
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                this.O.get(i11).setAlpha(1.0f);
            }
        } else {
            this.f31961o.F(viewParamsD.f32324b, viewParamsD.f32325c, viewParamsD.f32326d, viewParamsD.f32327e, i10, iArr[1]);
            this.f31961o.J(false);
        }
        ObjectAnimator.ofFloat(this.f31962p, "alpha", 0.0f, 1.0f).setDuration(50L).start();
    }

    public final void k2(int i10) {
        this.f31962p.post(new o(i10));
    }

    public void l2(LocalMedia localMedia) {
        if (this.f31969w || this.f31968v || !this.f32146f.M) {
            return;
        }
        this.f31962p.post(new g());
        if (a8.d.i(localMedia.s())) {
            C1(localMedia, !a8.d.g(localMedia.f()), new h());
        } else {
            B1(localMedia, !a8.d.g(localMedia.f()), new i());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PicturePreviewAdapter picturePreviewAdapter = this.f31963q;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        ViewPager2 viewPager2 = this.f31962p;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.P);
        }
        super.onDestroy();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void r0(boolean z10, LocalMedia localMedia) {
        this.G.setSelected(j8.a.n().contains(localMedia));
        this.f31964r.h();
        this.J.setSelectedChange(true);
        S1(localMedia);
        R1(z10, localMedia);
    }

    public void u1(View... viewArr) {
        Collections.addAll(this.O, viewArr);
    }

    public final void v1(int i10) {
        LocalMedia localMedia = this.f31960n.get(i10);
        if (a8.d.i(localMedia.s())) {
            C1(localMedia, false, new p(i10));
        } else {
            B1(localMedia, false, new q(i10));
        }
    }

    public final void w1(int[] iArr) {
        int i10;
        int i11;
        ViewParams viewParamsD = i8.a.d(this.f31971y ? this.f31967u + 1 : this.f31967u);
        if (viewParamsD == null || (i10 = iArr[0]) == 0 || (i11 = iArr[1]) == 0) {
            this.f31961o.F(0, 0, 0, 0, iArr[0], iArr[1]);
            this.f31961o.C(iArr[0], iArr[1], false);
        } else {
            this.f31961o.F(viewParamsD.f32324b, viewParamsD.f32325c, viewParamsD.f32326d, viewParamsD.f32327e, i10, i11);
            this.f31961o.B();
        }
    }

    public PicturePreviewAdapter x1() {
        return new PicturePreviewAdapter();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void y1() {
        f8.g gVar;
        if (!this.A || (gVar = PictureSelectionConfig.X0) == null) {
            return;
        }
        gVar.b(this.f31962p.getCurrentItem());
        int currentItem = this.f31962p.getCurrentItem();
        this.f31960n.remove(currentItem);
        if (this.f31960n.size() == 0) {
            D1();
            return;
        }
        this.f31965s.setTitle(getString(R$string.ps_preview_image_num, Integer.valueOf(this.f31967u + 1), Integer.valueOf(this.f31960n.size())));
        this.C = this.f31960n.size();
        this.f31967u = currentItem;
        if (this.f31962p.getAdapter() != null) {
            this.f31962p.setAdapter(null);
            this.f31962p.setAdapter(this.f31963q);
        }
        this.f31962p.setCurrentItem(this.f31967u, false);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void z0(boolean z10) {
        if (PictureSelectionConfig.T0.c().W() && PictureSelectionConfig.T0.c().Y()) {
            int i10 = 0;
            while (i10 < j8.a.l()) {
                LocalMedia localMedia = j8.a.n().get(i10);
                i10++;
                localMedia.l0(i10);
            }
        }
    }

    public final void z1() {
        this.f31965s.getImageDelete().setVisibility(this.A ? 0 : 8);
        this.G.setVisibility(8);
        this.f31964r.setVisibility(8);
        this.J.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final void B1(LocalMedia localMedia, boolean z10, f8.d<int[]> dVar) {
        int iK;
        int iJ;
        boolean z11;
        if (o8.j.n(localMedia.D(), localMedia.q())) {
            iK = this.D;
            iJ = this.E;
        } else {
            int iD = localMedia.D();
            int iQ = localMedia.q();
            if (z10 && ((iD <= 0 || iQ <= 0 || iD > iQ) && this.f32146f.H0)) {
                this.f31962p.setAlpha(0.0f);
                o8.j.g(getContext(), localMedia.f(), new r(localMedia, dVar));
                iK = iD;
                iJ = iQ;
                z11 = false;
            } else {
                iK = iD;
                iJ = iQ;
            }
            if (localMedia.G() && localMedia.k() > 0 && localMedia.j() > 0) {
                iK = localMedia.k();
                iJ = localMedia.j();
            }
            if (z11) {
                dVar.a(new int[]{iK, iJ});
            }
        }
        z11 = true;
        if (localMedia.G()) {
            iK = localMedia.k();
            iJ = localMedia.j();
        }
        if (z11) {
            dVar.a(new int[]{iK, iJ});
        }
    }

    public final void D1() {
        if (!o8.a.c(getActivity())) {
            if (this.f32146f.L) {
                F1();
            }
            f0();
        }
    }

    public final void E1(List<LocalMedia> list, boolean z10) {
        if (o8.a.c(getActivity())) {
            return;
        }
        this.f31966t = z10;
        if (z10) {
            if (list.size() > 0) {
                int size = this.f31960n.size();
                this.f31960n.addAll(list);
                this.f31963q.notifyItemRangeChanged(size, this.f31960n.size());
                return;
            }
            O1();
        }
    }

    public final void G1() {
        float f10 = 1.0f;
        if (M1()) {
            if (!this.f31969w) {
                f10 = 0.0f;
            }
            this.f31961o.setBackgroundAlpha(f10);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                if (!(this.O.get(i10) instanceof TitleBar)) {
                    this.O.get(i10).setAlpha(f10);
                }
            }
            return;
        }
        this.f31961o.setBackgroundAlpha(1.0f);
    }

    public final void L1(ArrayList<LocalMedia> arrayList) {
        boolean z10;
        PicturePreviewAdapter picturePreviewAdapterX1 = x1();
        this.f31963q = picturePreviewAdapterX1;
        picturePreviewAdapterX1.k(arrayList);
        this.f31963q.l(new b0(this, null));
        this.f31962p.setOrientation(0);
        this.f31962p.setAdapter(this.f31963q);
        j8.a.g();
        if (arrayList.size() != 0 && this.f31967u <= arrayList.size()) {
            LocalMedia localMedia = arrayList.get(this.f31967u);
            PreviewBottomNavBar previewBottomNavBar = this.f31964r;
            if (!a8.d.i(localMedia.s()) && !a8.d.d(localMedia.s())) {
                z10 = false;
            } else {
                z10 = true;
            }
            previewBottomNavBar.i(z10);
            this.G.setSelected(j8.a.n().contains(arrayList.get(this.f31962p.getCurrentItem())));
            this.f31962p.registerOnPageChangeCallback(this.P);
            this.f31962p.setPageTransformer(new MarginPageTransformer(o8.e.a(getContext(), 3.0f)));
            this.f31962p.setCurrentItem(this.f31967u, false);
            z0(false);
            S1(arrayList.get(this.f31967u));
            l2(localMedia);
            return;
        }
        j0();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        int iA = a8.b.a(getContext(), 2);
        if (iA != 0) {
            return iA;
        }
        return R$layout.ps_fragment_preview;
    }

    public boolean N1(LocalMedia localMedia) {
        return j8.a.n().contains(localMedia);
    }

    public final void V1() {
        if (!o8.a.c(getActivity())) {
            if (this.f31972z) {
                if (this.f32146f.M) {
                    this.f31961o.t();
                    return;
                } else {
                    f0();
                    return;
                }
            }
            if (this.f31968v) {
                X();
            } else if (this.f32146f.M) {
                this.f31961o.t();
            } else {
                X();
            }
        }
    }

    public void f2() {
        if (M1()) {
            this.f31961o.setOnMojitoViewCallback(new k());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void j0() {
        V1();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (M1()) {
            int size = this.f31960n.size();
            int i10 = this.f31967u;
            if (size > i10) {
                LocalMedia localMedia = this.f31960n.get(i10);
                if (a8.d.i(localMedia.s())) {
                    C1(localMedia, false, new t());
                } else {
                    B1(localMedia, false, new u());
                }
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        int i12;
        if (M1()) {
            return null;
        }
        PictureWindowAnimationStyle pictureWindowAnimationStyleE = PictureSelectionConfig.T0.e();
        if (pictureWindowAnimationStyleE.f32357d != 0 && pictureWindowAnimationStyleE.f32358e != 0) {
            FragmentActivity activity = getActivity();
            if (z10) {
                i12 = pictureWindowAnimationStyleE.f32357d;
            } else {
                i12 = pictureWindowAnimationStyleE.f32358e;
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, i12);
            if (z10) {
                d0();
            } else {
                e0();
            }
            return animationLoadAnimation;
        }
        return super.onCreateAnimation(i10, z10, i11);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.luck.picture.lib.current_page", this.f32144d);
        bundle.putLong("com.luck.picture.lib.current_bucketId", this.F);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f31967u);
        bundle.putInt("com.luck.picture.lib.current_album_total", this.C);
        bundle.putBoolean("com.luck.picture.lib.external_preview", this.f31972z);
        bundle.putBoolean("com.luck.picture.lib.external_preview_display_delete", this.A);
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f31971y);
        bundle.putBoolean("com.luck.picture.lib.bottom_preview", this.f31968v);
        bundle.putString("com.luck.picture.lib.current_album_name", this.f31970x);
        j8.a.d(this.f31960n);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        boolean z10;
        super.onViewCreated(view, bundle);
        c2(bundle);
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31969w = z10;
        this.D = o8.e.e(getContext());
        this.E = o8.e.g(getContext());
        this.f31965s = (PreviewTitleBar) view.findViewById(R$id.title_bar);
        this.G = (TextView) view.findViewById(R$id.ps_tv_selected);
        this.H = (TextView) view.findViewById(R$id.ps_tv_selected_word);
        this.I = view.findViewById(R$id.select_click_area);
        this.J = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f31961o = (MagicalView) view.findViewById(R$id.magical);
        this.f31962p = new ViewPager2(getContext());
        this.f31964r = (PreviewBottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f31961o.setMagicalContent(this.f31962p);
        g2();
        f2();
        u1(this.f31965s, this.G, this.H, this.I, this.J, this.f31964r);
        T1();
        K1();
        L1(this.f31960n);
        if (this.f31972z) {
            z1();
        } else {
            H1();
            J1((ViewGroup) view);
            I1();
        }
        G1();
    }
}
