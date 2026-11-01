package n8;

import com.luck.picture.lib.style.AlbumWindowStyle;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.style.TitleBarStyle;

/* JADX INFO: compiled from: PictureSelectorStyle.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlbumWindowStyle f64702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TitleBarStyle f64703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SelectMainStyle f64704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BottomNavBarStyle f64705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PictureWindowAnimationStyle f64706e;

    public AlbumWindowStyle a() {
        AlbumWindowStyle albumWindowStyle = this.f64702a;
        return albumWindowStyle == null ? new AlbumWindowStyle() : albumWindowStyle;
    }

    public BottomNavBarStyle b() {
        BottomNavBarStyle bottomNavBarStyle = this.f64705d;
        return bottomNavBarStyle == null ? new BottomNavBarStyle() : bottomNavBarStyle;
    }

    public SelectMainStyle c() {
        SelectMainStyle selectMainStyle = this.f64704c;
        return selectMainStyle == null ? new SelectMainStyle() : selectMainStyle;
    }

    public TitleBarStyle d() {
        TitleBarStyle titleBarStyle = this.f64703b;
        return titleBarStyle == null ? new TitleBarStyle() : titleBarStyle;
    }

    public PictureWindowAnimationStyle e() {
        if (this.f64706e == null) {
            this.f64706e = PictureWindowAnimationStyle.c();
        }
        return this.f64706e;
    }

    public void f(BottomNavBarStyle bottomNavBarStyle) {
        this.f64705d = bottomNavBarStyle;
    }

    public void g(SelectMainStyle selectMainStyle) {
        this.f64704c = selectMainStyle;
    }

    public void h(TitleBarStyle titleBarStyle) {
        this.f64703b = titleBarStyle;
    }
}
