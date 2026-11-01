package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends z0 implements e2 {
    public n0 extensions = n0.f18240d;

    private <MessageType extends d2> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, w wVar, h0 h0Var) throws IOException {
        int iU = 0;
        q qVarE = null;
        x0 x0VarA = null;
        while (true) {
            int iT = wVar.t();
            if (iT == 0) {
                break;
            }
            if (iT == 16) {
                iU = wVar.u();
                if (iU != 0) {
                    x0VarA = h0Var.a(iU, messagetype);
                }
            } else if (iT == 26) {
                if (iU == 0 || x0VarA == null) {
                    qVarE = wVar.e();
                } else {
                    eagerlyMergeMessageSetExtension(wVar, x0VarA, h0Var, iU);
                    qVarE = null;
                }
            } else if (!wVar.e(iT)) {
                break;
            }
        }
        wVar.a(12);
        if (qVarE == null || iU == 0) {
            return;
        }
        if (x0VarA != null) {
            mergeMessageSetExtensionFromBytes(qVarE, h0Var, x0VarA);
        } else {
            mergeLengthDelimitedField(iU, qVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(e0 e0Var) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        Type type = (Type) this.extensions.f18241a.get(x0VarAccess$000.f18334d);
        if (type == 0) {
            return (Type) x0VarAccess$000.f18332b;
        }
        w0 w0Var = x0VarAccess$000.f18334d;
        if (!w0Var.f18320d) {
            return w0Var.f18319c.a() == k4.ENUM ? (Type) x0VarAccess$000.f18334d.f18317a.a(((Integer) type).intValue()) : type;
        }
        if (w0Var.f18319c.a() != k4.ENUM) {
            return type;
        }
        ?? r10 = (Type) new ArrayList();
        for (Object objA : (List) type) {
            if (x0VarAccess$000.f18334d.f18319c.a() == k4.ENUM) {
                objA = x0VarAccess$000.f18334d.f18317a.a(((Integer) objA).intValue());
            }
            r10.add(objA);
        }
        return r10;
    }

    private void eagerlyMergeMessageSetExtension(w wVar, x0 x0Var, h0 h0Var, int i10) throws IOException {
        parseExtension(wVar, h0Var, x0Var, (i10 << 3) | 2, i10);
    }

    private void mergeMessageSetExtensionFromBytes(s sVar, h0 h0Var, x0 x0Var) throws IOException {
        d2 d2Var = (d2) this.extensions.f18241a.get(x0Var.f18334d);
        c2 builder = d2Var != null ? d2Var.toBuilder() : null;
        if (builder == null) {
            builder = x0Var.f18333c.newBuilderForType();
        }
        t0 t0Var = (t0) builder;
        t0Var.getClass();
        try {
            w wVarD = sVar.d();
            t0Var.a(wVarD, h0Var);
            wVarD.a(0);
            Object objA = t0Var.a();
            n0 n0VarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            w0 w0Var = x0Var.f18334d;
            if (w0Var.f18319c.a() == k4.ENUM) {
                objA = Integer.valueOf(((d1) objA).a());
            }
            n0VarEnsureExtensionsAreMutable.c(w0Var, objA);
        } catch (n1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading " + t0Var.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [com.fyber.inneractive.sdk.protobuf.d1] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Integer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean parseExtension(w wVar, h0 h0Var, x0 x0Var, int i10, int i11) throws IOException {
        boolean z10;
        Object objA;
        d2 d2Var;
        int i12 = i10 & 7;
        boolean z11 = false;
        if (x0Var == null) {
            z10 = false;
            z11 = true;
        } else {
            j4 j4Var = x0Var.f18334d.f18319c;
            n0 n0Var = n0.f18240d;
            if (i12 == j4Var.b()) {
                z10 = false;
            } else {
                w0 w0Var = x0Var.f18334d;
                if (w0Var.f18320d && w0Var.f18319c.c()) {
                    j4 j4Var2 = x0Var.f18334d.f18319c;
                    if (i12 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                } else {
                    z10 = false;
                    z11 = true;
                }
            }
        }
        if (z11) {
            return parseUnknownField(i10, wVar);
        }
        ensureExtensionsAreMutable();
        if (z10) {
            int iD = wVar.d(wVar.m());
            if (x0Var.f18334d.f18319c == j4.ENUM) {
                while (wVar.a() > 0) {
                    Object objA2 = x0Var.f18334d.f18317a.a(wVar.g());
                    if (objA2 == 0) {
                        return true;
                    }
                    n0 n0Var2 = this.extensions;
                    w0 w0Var2 = x0Var.f18334d;
                    if (w0Var2.f18319c.a() == k4.ENUM) {
                        objA2 = Integer.valueOf(objA2.a());
                    }
                    n0Var2.a(w0Var2, objA2);
                }
            } else {
                while (wVar.a() > 0) {
                    j4 j4Var3 = x0Var.f18334d.f18319c;
                    n0 n0Var3 = n0.f18240d;
                    this.extensions.a(x0Var.f18334d, p4.a(wVar, j4Var3, o4.LOOSE));
                }
            }
            wVar.c(iD);
        } else {
            int i13 = s0.f18277a[x0Var.f18334d.f18319c.a().ordinal()];
            if (i13 == 1) {
                c2 c2VarNewBuilderForType = null;
                w0 w0Var3 = x0Var.f18334d;
                if (!w0Var3.f18320d && (d2Var = (d2) this.extensions.f18241a.get(w0Var3)) != null) {
                    c2VarNewBuilderForType = d2Var.toBuilder();
                }
                if (c2VarNewBuilderForType == null) {
                    c2VarNewBuilderForType = x0Var.f18333c.newBuilderForType();
                }
                w0 w0Var4 = x0Var.f18334d;
                if (w0Var4.f18319c == j4.GROUP) {
                    wVar.a(w0Var4.f18318b, c2VarNewBuilderForType, h0Var);
                } else {
                    wVar.a(c2VarNewBuilderForType, h0Var);
                }
                objA = ((t0) c2VarNewBuilderForType).a();
            } else if (i13 != 2) {
                j4 j4Var4 = x0Var.f18334d.f18319c;
                n0 n0Var4 = n0.f18240d;
                objA = p4.a(wVar, j4Var4, o4.LOOSE);
            } else {
                int iG = wVar.g();
                d1 d1VarA = x0Var.f18334d.f18317a.a(iG);
                if (d1VarA == null) {
                    mergeVarintField(i11, iG);
                    return true;
                }
                objA = d1VarA;
            }
            w0 w0Var5 = x0Var.f18334d;
            if (w0Var5.f18320d) {
                n0 n0Var5 = this.extensions;
                if (w0Var5.f18319c.a() == k4.ENUM) {
                    objA = Integer.valueOf(((d1) objA).a());
                }
                n0Var5.a(w0Var5, objA);
            } else {
                n0 n0Var6 = this.extensions;
                if (w0Var5.f18319c.a() == k4.ENUM) {
                    objA = Integer.valueOf(((d1) objA).a());
                }
                n0Var6.c(w0Var5, objA);
            }
        }
        return true;
    }

    private void verifyExtensionContainingType(x0 x0Var) {
        if (x0Var.f18331a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public n0 ensureExtensionsAreMutable() {
        n0 n0Var = this.extensions;
        if (n0Var.f18242b) {
            this.extensions = n0Var.m211clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.c();
    }

    public int extensionsSerializedSize() {
        return this.extensions.b();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.a();
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        n0 n0Var = this.extensions;
        if (n0Var.f18242b) {
            this.extensions = n0Var.m211clone();
        }
        this.extensions.a(messagetype.extensions);
    }

    public v0 newExtensionWriter() {
        return new v0(this);
    }

    public v0 newMessageSetExtensionWriter() {
        return new v0(this);
    }

    public <MessageType extends d2> boolean parseUnknownField(MessageType messagetype, w wVar, h0 h0Var, int i10) throws IOException {
        int i11 = i10 >>> 3;
        return parseExtension(wVar, h0Var, h0Var.a(i11, messagetype), i10, i11);
    }

    public <MessageType extends d2> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, w wVar, h0 h0Var, int i10) throws IOException {
        if (i10 != 11) {
            return (i10 & 7) == 2 ? parseUnknownField(messagetype, wVar, h0Var, i10) : wVar.e(i10);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, wVar, h0Var);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.e2
    public /* bridge */ /* synthetic */ d2 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final <Type> int getExtensionCount(e0 e0Var) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        w0 w0Var = x0VarAccess$000.f18334d;
        n0Var.getClass();
        if (w0Var.f18320d) {
            Object obj = n0Var.f18241a.get(w0Var);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final <Type> boolean hasExtension(e0 e0Var) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        w0 w0Var = x0VarAccess$000.f18334d;
        n0Var.getClass();
        if (!w0Var.f18320d) {
            if (n0Var.f18241a.get(w0Var) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.d2
    public /* bridge */ /* synthetic */ c2 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.d2
    public /* bridge */ /* synthetic */ c2 toBuilder() {
        return toBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(e0 e0Var, int i10) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        w0 w0Var = x0VarAccess$000.f18334d;
        n0Var.getClass();
        if (w0Var.f18320d) {
            Object obj = n0Var.f18241a.get(w0Var);
            if (obj != null) {
                Type type = (Type) ((List) obj).get(i10);
                return x0VarAccess$000.f18334d.f18319c.a() == k4.ENUM ? (Type) x0VarAccess$000.f18334d.f18317a.a(((Integer) type).intValue()) : type;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
