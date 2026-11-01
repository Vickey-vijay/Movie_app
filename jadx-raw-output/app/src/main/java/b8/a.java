package b8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import com.luck.picture.lib.adapter.PictureAlbumAdapter;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.List;
import o8.e;
import o8.l;

/* JADX INFO: compiled from: AlbumListPopWindow.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f5284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f5285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5286d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PictureAlbumAdapter f5288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f5289g;

    /* JADX INFO: renamed from: b8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class ViewOnClickListenerC0015a implements View.OnClickListener {
        public ViewOnClickListenerC0015a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (l.b()) {
                a.this.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.super.dismiss();
            a.this.f5286d = false;
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public interface d {
        void a();

        void b();
    }

    public static a d(Context context) {
        return new a(context);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void c(List<LocalMediaFolder> list) {
        this.f5288f.d(list);
        this.f5288f.notifyDataSetChanged();
        this.f5285c.getLayoutParams().height = list.size() > 8 ? this.f5287e : -2;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (this.f5286d) {
            return;
        }
        this.f5284b.setAlpha(0.0f);
        d dVar = this.f5289g;
        if (dVar != null) {
            dVar.b();
        }
        this.f5286d = true;
        this.f5284b.post(new c());
    }

    public void e() {
        List<LocalMediaFolder> listE = this.f5288f.e();
        for (int i10 = 0; i10 < listE.size(); i10++) {
            LocalMediaFolder localMediaFolder = listE.get(i10);
            localMediaFolder.t(false);
            this.f5288f.notifyItemChanged(i10);
            for (int i11 = 0; i11 < j8.a.l(); i11++) {
                if (TextUtils.equals(localMediaFolder.h(), j8.a.n().get(i11).v()) || localMediaFolder.c() == -1) {
                    localMediaFolder.t(true);
                    this.f5288f.notifyItemChanged(i10);
                    break;
                }
            }
        }
    }

    public List<LocalMediaFolder> f() {
        return this.f5288f.e();
    }

    public LocalMediaFolder h(int i10) {
        if (this.f5288f.e().size() <= 0 || i10 >= this.f5288f.e().size()) {
            return null;
        }
        return this.f5288f.e().get(i10);
    }

    public int i() {
        return this.f5288f.e().size();
    }

    public final void j() {
        this.f5287e = (int) (((double) e.g(this.f5283a)) * 0.6d);
        this.f5285c = (RecyclerView) getContentView().findViewById(R$id.folder_list);
        this.f5284b = getContentView().findViewById(R$id.rootViewBg);
        this.f5285c.setLayoutManager(new WrapContentLinearLayoutManager(this.f5283a));
        PictureAlbumAdapter pictureAlbumAdapter = new PictureAlbumAdapter();
        this.f5288f = pictureAlbumAdapter;
        this.f5285c.setAdapter(pictureAlbumAdapter);
        this.f5284b.setOnClickListener(new ViewOnClickListenerC0015a());
        getContentView().findViewById(R$id.rootView).setOnClickListener(new b());
    }

    public void k(f8.a aVar) {
        this.f5288f.h(aVar);
    }

    public void l(d dVar) {
        this.f5289g = dVar;
    }

    public a(Context context) {
        this.f5283a = context;
        setContentView(LayoutInflater.from(context).inflate(R$layout.ps_window_folder, (ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(R$style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        j();
    }

    public int g() {
        if (i() <= 0) {
            return 0;
        }
        return h(0).i();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        if (f() != null && f().size() != 0) {
            if (l.c()) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                showAtLocation(view, 0, 0, iArr[1] + view.getHeight());
            } else {
                super.showAsDropDown(view);
            }
            this.f5286d = false;
            d dVar = this.f5289g;
            if (dVar != null) {
                dVar.a();
            }
            this.f5284b.animate().alpha(1.0f).setDuration(250L).setStartDelay(250L).start();
            e();
        }
    }
}
