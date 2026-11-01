package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: TouchEventData.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f33801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f33802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f33803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f33804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f33805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f33806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f33809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f33810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f33811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f33815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0313a> f33816p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33817q = 0;

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f33801a = a(motionEvent);
        this.f33802b = b(motionEvent);
        this.f33807g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TouchEventData.java */
    public static class C0313a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f33819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f33820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f33821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f33822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f33823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f33824g;

        public C0313a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f33818a = i10;
            this.f33819b = f10;
            this.f33820c = f11;
            this.f33821d = f12;
            this.f33822e = f13;
            this.f33823f = f14;
            this.f33824g = i11;
        }
    }

    private void g(MotionEvent motionEvent) {
        this.f33816p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f33817q = 1;
            this.f33816p.add(new C0313a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f33817q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f33817q; i10++) {
                this.f33816p.add(new C0313a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    public void c(View view) {
        this.f33815o = view;
        this.f33813m = view.getWidth();
        this.f33814n = view.getHeight();
    }

    private void h(MotionEvent motionEvent) {
        this.f33809i = motionEvent.getPressure();
        this.f33810j = motionEvent.getSize();
        this.f33811k = motionEvent.getOrientation();
        this.f33812l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void e(MotionEvent motionEvent) {
        this.f33803c = a(motionEvent);
        this.f33804d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f33805e = a(motionEvent);
        this.f33806f = b(motionEvent);
        this.f33808h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0313a c0313a : this.f33816p) {
            HashMap map2 = new HashMap();
            map2.put(VastAttributes.HORIZONTAL_POSITION, String.valueOf(c0313a.f33819b));
            map2.put(VastAttributes.VERTICAL_POSITION, String.valueOf(c0313a.f33820c));
            map2.put("pressure", String.valueOf(c0313a.f33821d));
            map2.put("size", String.valueOf(c0313a.f33822e));
            map2.put("id", Integer.valueOf(c0313a.f33818a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f33801a));
        map.put("down_y", Float.valueOf(this.f33802b));
        map.put("down_time", Long.valueOf(this.f33807g));
        map.put("up_x", Float.valueOf(this.f33805e));
        map.put("up_y", Float.valueOf(this.f33806f));
        map.put("up_time", Long.valueOf(this.f33808h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f33815o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f33815o);
            map.put("resource_id", strB);
            String strA = a(this.f33815o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f33815o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put("event_name", "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f33807g));
    }

    public void c() {
        this.f33806f = 0.0f;
        this.f33805e = 0.0f;
        this.f33804d = 0.0f;
        this.f33803c = 0.0f;
        this.f33802b = 0.0f;
        this.f33801a = 0.0f;
        this.f33808h = 0L;
        this.f33807g = 0L;
        this.f33811k = 0.0f;
        this.f33810j = 0.0f;
        this.f33809i = 0.0f;
        this.f33812l = 0;
        this.f33814n = 0;
        this.f33813m = 0;
        this.f33815o = null;
        this.f33817q = 0;
        this.f33816p.clear();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private String b(View view) {
        if (view.getId() == -1) {
            return "";
        }
        try {
            return view.getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return String.valueOf(view.getId());
        }
    }

    public C0313a b() {
        if (this.f33816p.isEmpty()) {
            return null;
        }
        return this.f33816p.get(0);
    }
}
