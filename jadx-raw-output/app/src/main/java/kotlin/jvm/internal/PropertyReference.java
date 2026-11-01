package kotlin.jvm.internal;

import ck.p;
import jk.b;
import jk.k;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PropertyReference extends CallableReference implements k {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && p.e(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof k) {
            return obj.equals(compute());
        }
        return false;
    }

    public abstract /* synthetic */ k.a getGetter();

    @Override // kotlin.jvm.internal.CallableReference
    public b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public k getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (k) super.getReflected();
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // jk.k
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // jk.k
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}
