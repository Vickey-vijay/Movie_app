package wb;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: RCheckHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends c {
    @Override // wb.c
    public boolean M() {
        T t10 = this.G0;
        if (t10 != 0) {
            return ((CompoundButton) t10).isChecked();
        }
        return false;
    }

    public b(Context context, CompoundButton compoundButton, AttributeSet attributeSet) {
        super(context, compoundButton, attributeSet);
    }
}
