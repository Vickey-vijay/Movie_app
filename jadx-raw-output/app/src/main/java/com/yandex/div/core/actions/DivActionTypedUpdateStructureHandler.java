package com.yandex.div.core.actions;

import bk.l;
import ck.p;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionUpdateStructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.c;
import lk.a0;
import nj.b0;
import nj.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivActionTypedUpdateStructureHandler implements DivActionTypedHandler {

    /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
    public interface Structure {

        /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class Array implements Structure {
            private final JSONArray array;

            public int getSize() {
                return this.array.length();
            }

            public Array(JSONArray jSONArray) {
                this.array = jSONArray;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public Structure get(String str) {
                boolean zE;
                Object objOpt = this.array.opt(Integer.parseInt(str));
                if (objOpt instanceof JSONArray) {
                    return new Array((JSONArray) objOpt);
                }
                if (objOpt instanceof JSONObject) {
                    return new Dictionary((JSONObject) objOpt);
                }
                if (objOpt == null) {
                    zE = true;
                } else {
                    zE = p.e(objOpt, JSONObject.NULL);
                }
                if (zE) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(String str, Object obj) {
                int i10 = Integer.parseInt(str);
                if (i10 >= 0 && i10 <= getSize()) {
                    try {
                        Result.a aVar = Result.Companion;
                        Result.m3458constructorimpl(this.array.put(i10, obj));
                        return;
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        Result.m3458constructorimpl(c.a(th2));
                        return;
                    }
                }
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class Dictionary implements Structure {
            private final JSONObject dictionary;

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public Structure get(String str) {
                Object objOpt = this.dictionary.opt(str);
                if (objOpt instanceof JSONArray) {
                    return new Array((JSONArray) objOpt);
                }
                if (objOpt instanceof JSONObject) {
                    return new Dictionary((JSONObject) objOpt);
                }
                if (objOpt == null ? true : p.e(objOpt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(String str, Object obj) {
                try {
                    Result.a aVar = Result.Companion;
                    Result.m3458constructorimpl(this.dictionary.put(str, obj));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    Result.m3458constructorimpl(c.a(th2));
                }
            }

            public Dictionary(JSONObject jSONObject) {
                this.dictionary = jSONObject;
            }
        }

        /* JADX INFO: compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class NonStructure implements Structure {
            public static final NonStructure INSTANCE = new NonStructure();

            private NonStructure() {
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public Structure get(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(String str, Object obj) {
                throw new UnsupportedOperationException();
            }
        }

        Structure get(String str);

        void set(String str, Object obj);
    }

    private final boolean setValue(Div2View div2View, Structure structure, String str, Object obj) {
        try {
            structure.set(str, obj);
            return true;
        } catch (IndexOutOfBoundsException e10) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Position '" + str + "' is out of array bounds", e10));
            return false;
        } catch (NumberFormatException e11) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Unable to use '" + str + "' as array index", e11));
            return false;
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (divActionTyped instanceof DivActionTyped.u) {
            return handleAction(((DivActionTyped.u) divActionTyped).c(), div2View, expressionResolver);
        }
        return false;
    }

    private final Structure findStructureElement(Div2View div2View, Structure structure, List<String> list) {
        int i10 = 0;
        Structure structure2 = structure;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            String str = (String) obj;
            try {
                structure2 = structure2.get(str);
                if (p.e(structure2, Structure.NonStructure.INSTANCE)) {
                    DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Element with path '" + b0.p0(b0.I0(list, i11), "/", null, null, 0, null, null, 62, null) + "' is not a structure"));
                    return null;
                }
                if (structure2 == null) {
                    DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Element with path '" + b0.p0(b0.I0(list, i11), "/", null, null, 0, null, null, 62, null) + "' is not found"));
                    return null;
                }
                i10 = i11;
            } catch (NumberFormatException e10) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Unable to use '" + str + "' as array index", e10));
                return null;
            }
        }
        return structure2;
    }

    private final boolean handleAction(DivActionUpdateStructure divActionUpdateStructure, final Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionUpdateStructure.f46405c.evaluate(expressionResolver);
        String strEvaluate2 = divActionUpdateStructure.f46403a.evaluate(expressionResolver);
        List listN0 = a0.N0(strEvaluate2, new String[]{"/"}, false, 0, 6, null);
        final ArrayList arrayList = new ArrayList();
        Iterator it = listN0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(divActionUpdateStructure.f46404b, expressionResolver);
        if (!(strEvaluate2.length() > 0) || !arrayList.isEmpty()) {
            VariableMutationHandler.Companion.setVariable(div2View, strEvaluate, expressionResolver, new l<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.handleAction.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public final Variable invoke(Variable variable) {
                    if (variable instanceof Variable.ArrayVariable) {
                        DivActionTypedUpdateStructureHandler.this.updateArrayStructure(div2View, (Variable.ArrayVariable) variable, arrayList, objEvaluate);
                    } else if (variable instanceof Variable.DictVariable) {
                        DivActionTypedUpdateStructureHandler.this.updateDictStructure(div2View, (Variable.DictVariable) variable, arrayList, objEvaluate);
                    } else {
                        DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Action requires array or dictionary variable"));
                    }
                    return variable;
                }
            });
            return true;
        }
        DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Malformed path '" + strEvaluate2 + "': all path segments are empty"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateArrayStructure(Div2View div2View, Variable.ArrayVariable arrayVariable, List<String> list, Object obj) {
        Object value = arrayVariable.getValue();
        p.h(value, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) value;
        Structure structureFindStructureElement = findStructureElement(div2View, new Structure.Array(jSONArray), b0.Y(list, 1));
        if (structureFindStructureElement != null && setValue(div2View, structureFindStructureElement, (String) b0.r0(list), obj)) {
            arrayVariable.set(jSONArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDictStructure(Div2View div2View, Variable.DictVariable dictVariable, List<String> list, Object obj) {
        Object value = dictVariable.getValue();
        p.h(value, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) value;
        Structure structureFindStructureElement = findStructureElement(div2View, new Structure.Dictionary(jSONObject), b0.Y(list, 1));
        if (structureFindStructureElement != null && setValue(div2View, structureFindStructureElement, (String) b0.r0(list), obj)) {
            dictVariable.set(jSONObject);
        }
    }
}
