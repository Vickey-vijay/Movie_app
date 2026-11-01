package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bk.l;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.VariableMonitorView;
import com.yandex.div.data.Variable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;
import nj.b0;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public final class VariableMonitorView extends LinearLayout {
    private final Context context;
    private final LinearLayout title;
    private final VariableAdapter variablesAdapter;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.errors.VariableMonitorView$1, reason: invalid class name */
    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements l<List<? extends Pair<? extends String, ? extends Variable>>, r> {
        public AnonymousClass1(Object obj) {
            super(1, obj, VariableMonitorView.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(List<? extends Pair<? extends String, ? extends Variable>> list) {
            invoke2((List<? extends Pair<String, ? extends Variable>>) list);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Pair<String, ? extends Variable>> list) {
            ((VariableMonitorView) this.receiver).updateTable(list);
        }
    }

    private final TextView createCellTitle(String str) {
        TextView textView = new TextView(this.context);
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        textView.setTextColor(-1);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    private final RecyclerView createTable() {
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.variablesAdapter);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        return recyclerView;
    }

    private final LinearLayout createTableTitle() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        List listN = s.n(200, 60, 100);
        List listN2 = s.n("name", "type", "value");
        ArrayList arrayList = new ArrayList(t.v(listN2, 10));
        Iterator it = listN2.iterator();
        while (it.hasNext()) {
            arrayList.add(createCellTitle((String) it.next()));
        }
        for (Pair pair : b0.V0(arrayList, listN)) {
            linearLayout.addView((TextView) pair.component1(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(((Number) pair.component2()).intValue()), linearLayout.getResources().getDisplayMetrics()), -2));
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTable(List<? extends Pair<String, ? extends Variable>> list) {
        VariableAdapter variableAdapter = this.variablesAdapter;
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(VariableMonitorViewKt.toModel((Variable) pair.component2(), (String) pair.component1()));
        }
        variableAdapter.submitList(arrayList, new Runnable() { // from class: ae.d
            @Override // java.lang.Runnable
            public final void run() {
                VariableMonitorView.updateTable$lambda$5(this.f3539b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTable$lambda$5(VariableMonitorView variableMonitorView) {
        variableMonitorView.title.setVisibility(variableMonitorView.variablesAdapter.getItemCount() != 0 ? 0 : 8);
    }

    public VariableMonitorView(Context context, VariableMonitor variableMonitor) {
        super(context);
        this.context = context;
        this.variablesAdapter = new VariableAdapter(new VariableMonitorView$variablesAdapter$1(variableMonitor));
        LinearLayout linearLayoutCreateTableTitle = createTableTitle();
        this.title = linearLayoutCreateTableTitle;
        setOrientation(1);
        variableMonitor.setVariablesUpdatedCallback(new AnonymousClass1(this));
        addView(linearLayoutCreateTableTitle, new LinearLayout.LayoutParams(-1, -2));
        addView(createTable(), new LinearLayout.LayoutParams(-1, -2));
    }
}
