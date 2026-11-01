package chuangyuan.ycj.videolibrary.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.R$color;
import chuangyuan.ycj.videolibrary.R$layout;
import java.util.List;

/* JADX INFO: compiled from: SwitchAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f6035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f6036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f6038e;

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getItem(int i10) {
        return this.f6035b.get(i10);
    }

    public int b() {
        return this.f6037d;
    }

    public void c(int i10) {
        this.f6037d = i10;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6035b.size();
    }

    @Override // android.widget.Adapter
    @SuppressLint({"ViewHolder"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        AppCompatTextView appCompatTextView = view == null ? (AppCompatTextView) this.f6038e.inflate(R$layout.simple_exo_belowview_item, viewGroup, false) : (AppCompatTextView) view;
        appCompatTextView.setText(this.f6035b.get(i10));
        if (i10 == this.f6037d) {
            appCompatTextView.setTextColor(ContextCompat.getColor(this.f6036c, R$color.simple_exo_color_switch_item));
        } else {
            appCompatTextView.setTextColor(ContextCompat.getColor(this.f6036c, R.color.white));
        }
        return appCompatTextView;
    }

    public d(@NonNull Context context, @NonNull List<String> list) {
        this.f6035b = list;
        this.f6036c = context;
        this.f6038e = LayoutInflater.from(context);
    }
}
