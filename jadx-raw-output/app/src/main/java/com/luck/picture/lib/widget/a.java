package com.luck.picture.lib.widget;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: SlideSelectionHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements SlideSelectTouchListener.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0296a f32502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f32503b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<Integer> f32504c;

    /* JADX INFO: renamed from: com.luck.picture.lib.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SlideSelectionHandler.java */
    public interface InterfaceC0296a {
        void a(int i10, int i11, boolean z10, boolean z11);

        Set<Integer> getSelection();
    }

    /* JADX INFO: compiled from: SlideSelectionHandler.java */
    public interface b {
        void a(int i10);

        void b(int i10, boolean z10);
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.b
    public void a(int i10) {
        this.f32504c = null;
        b bVar = this.f32503b;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.b
    public void b(int i10) {
        this.f32504c = new HashSet<>();
        Set<Integer> selection = this.f32502a.getSelection();
        if (selection != null) {
            this.f32504c.addAll(selection);
        }
        boolean zContains = this.f32504c.contains(Integer.valueOf(i10));
        this.f32502a.a(i10, i10, !this.f32504c.contains(Integer.valueOf(i10)), true);
        b bVar = this.f32503b;
        if (bVar != null) {
            bVar.b(i10, zContains);
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.c
    public void c(int i10, int i11, boolean z10) {
        while (i10 <= i11) {
            d(i10, i10, z10 != this.f32504c.contains(Integer.valueOf(i10)));
            i10++;
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.f32502a.a(i10, i11, z10, false);
    }

    public a(InterfaceC0296a interfaceC0296a) {
        this.f32502a = interfaceC0296a;
    }
}
