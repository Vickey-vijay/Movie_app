package yads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class w40 extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk3 f84102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final il3 f84103b;

    public /* synthetic */ w40(bc1 bc1Var, z70 z70Var) {
        this(new wk3(bc1Var, z70Var), new il3());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ((ea0) viewHolder).a((ba0) getItem(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        ba0 ba0Var = (ba0) getItem(i10);
        this.f84103b.getClass();
        if (ba0Var instanceof u90) {
            return R$layout.debug_panel_item_action_button;
        }
        if (ba0Var instanceof aa0) {
            return R$layout.debug_panel_item_switch;
        }
        if (ba0Var instanceof v90) {
            return R$layout.debug_panel_item_divider;
        }
        if (ba0Var instanceof w90) {
            return R$layout.deubg_panel_item_header;
        }
        if (ba0Var instanceof x90) {
            return R$layout.deubg_panel_item_key_value;
        }
        if (ba0Var instanceof y90) {
            return R$layout.debug_panel_item_mediation_adapter;
        }
        if (ba0Var instanceof s90) {
            return R$layout.debug_panel_item_ad_units;
        }
        if (ba0Var instanceof r90) {
            return R$layout.debug_panel_item_ad_unit;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        wk3 wk3Var = this.f84102a;
        wk3Var.getClass();
        if (i10 == R$layout.debug_panel_item_action_button) {
            return new n0(pk3.f81445b, viewInflate);
        }
        if (i10 == R$layout.debug_panel_item_switch) {
            return new c53(viewInflate, new rk3(wk3Var));
        }
        if (i10 == R$layout.deubg_panel_item_header) {
            return new u01(viewInflate);
        }
        if (i10 == R$layout.deubg_panel_item_key_value) {
            return new je1(viewInflate);
        }
        if (i10 == R$layout.debug_panel_item_mediation_adapter) {
            return new mr1(viewInflate, wk3Var.f84250b, new sk3(wk3Var), new tk3(wk3Var));
        }
        if (i10 == R$layout.debug_panel_item_ad_units) {
            return new rb(viewInflate, new uk3(wk3Var));
        }
        if (i10 == R$layout.debug_panel_item_ad_unit) {
            return new pb(new vk3(wk3Var), viewInflate);
        }
        return new xi0(viewInflate);
    }

    public w40(wk3 wk3Var, il3 il3Var) {
        super(new t70());
        this.f84102a = wk3Var;
        this.f84103b = il3Var;
    }
}
