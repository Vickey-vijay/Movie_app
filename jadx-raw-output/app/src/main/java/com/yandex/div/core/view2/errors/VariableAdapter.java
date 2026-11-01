package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import bk.l;
import bk.q;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes7.dex */
final class VariableAdapter extends ListAdapter<VariableModel, VariableViewHolder> {
    private final q<String, String, String, r> variableMutator;

    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public static final class VariableDiffUtilCallback extends DiffUtil.ItemCallback<VariableModel> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(VariableModel variableModel, VariableModel variableModel2) {
            return p.e(variableModel.getValue(), variableModel2.getValue());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(VariableModel variableModel, VariableModel variableModel2) {
            return p.e(variableModel.getName(), variableModel2.getName());
        }
    }

    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public static final class VariableViewHolder extends RecyclerView.ViewHolder {
        private final VariableView root;
        private final q<String, String, String, r> variableMutator;

        public final void bind(final VariableModel variableModel) {
            VariableView variableView = this.root;
            variableView.getNameText().setText(fullName(variableModel));
            variableView.getTypeText().setText(variableModel.getType());
            variableView.getValueText().setText(variableModel.getValue());
            variableView.getValueText().setInputType(inputType(variableModel));
            variableView.setOnEnterAction(new l<String, r>() { // from class: com.yandex.div.core.view2.errors.VariableAdapter$VariableViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    this.this$0.variableMutator.invoke(variableModel.getName(), variableModel.getPath(), str);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VariableViewHolder(VariableView variableView, q<? super String, ? super String, ? super String, r> qVar) {
            super(variableView);
            this.root = variableView;
            this.variableMutator = qVar;
        }

        private final String fullName(VariableModel variableModel) {
            boolean z10;
            if (variableModel.getPath().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return variableModel.getPath() + '/' + variableModel.getName();
            }
            return variableModel.getName();
        }

        private final int inputType(VariableModel variableModel) {
            boolean zE;
            String type = variableModel.getType();
            if (p.e(type, "number")) {
                zE = true;
            } else {
                zE = p.e(type, TypedValues.Custom.S_INT);
            }
            if (!zE) {
                return 1;
            }
            return 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariableAdapter(q<? super String, ? super String, ? super String, r> qVar) {
        super(new VariableDiffUtilCallback());
        this.variableMutator = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VariableViewHolder variableViewHolder, int i10) {
        variableViewHolder.bind(getCurrentList().get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VariableViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new VariableViewHolder(new VariableView(viewGroup.getContext()), this.variableMutator);
    }
}
