package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$array;
import chuangyuan.ycj.videolibrary.R$dimen;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: BelowView.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f6020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PopupWindow f6021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListView f6022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0023b f6023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f6024e;

    /* JADX INFO: compiled from: BelowView.java */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (b.this.f6023d == null || i10 == b.this.f6024e.b()) {
                return;
            }
            b.this.f6023d.a(i10, b.this.f6024e.getItem(i10));
            b.this.f6024e.c(i10);
        }
    }

    /* JADX INFO: renamed from: chuangyuan.ycj.videolibrary.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BelowView.java */
    public interface InterfaceC0023b {
        void a(int i10, String str);
    }

    public void c() {
        PopupWindow popupWindow = this.f6021b;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f6021b.dismiss();
    }

    public void d(@Nullable InterfaceC0023b interfaceC0023b) {
        this.f6023d = interfaceC0023b;
    }

    public void e(@NonNull View view, boolean z10, int i10) {
        if (this.f6021b == null) {
            int dimension = (int) (view.getResources().getDimension(R$dimen.dp30) * this.f6024e.getCount());
            this.f6024e.c(i10);
            PopupWindow popupWindow = new PopupWindow(this.f6020a, -2, dimension, false);
            this.f6021b = popupWindow;
            popupWindow.setOutsideTouchable(z10);
            this.f6021b.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f6023d != null) {
                this.f6022c.setOnItemClickListener(new a());
            }
        }
        this.f6021b.setSoftInputMode(0);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f6021b.showAtLocation(view, 0, iArr[0] - (view.getWidth() / 6), iArr[1] - this.f6021b.getHeight());
    }

    public b(@NonNull Context context, @Nullable List<String> list) {
        View viewInflate = View.inflate(context, R$layout.simple_exo_belowview, null);
        this.f6020a = viewInflate;
        this.f6022c = (ListView) viewInflate.findViewById(R$id.list_item);
        this.f6024e = new d(context, list == null ? Arrays.asList(context.getResources().getStringArray(R$array.exo_video_switch_text)) : list);
        this.f6022c.measure(0, 0);
        this.f6022c.setAdapter((ListAdapter) this.f6024e);
    }
}
