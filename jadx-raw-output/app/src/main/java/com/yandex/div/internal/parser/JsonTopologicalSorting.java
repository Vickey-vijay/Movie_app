package com.yandex.div.internal.parser;

import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import nj.b0;
import nj.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonTopologicalSorting.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JsonTopologicalSorting {
    public static final JsonTopologicalSorting INSTANCE = new JsonTopologicalSorting();
    private static final ValueValidator<String> TYPE_VALIDATOR = new ValueValidator() { // from class: ge.f
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonTopologicalSorting.TYPE_VALIDATOR$lambda$0((String) obj);
        }
    };

    private JsonTopologicalSorting() {
    }

    private final void readObjectDependencies(ParsingContext parsingContext, ParsingErrorLogger parsingErrorLogger, JSONObject jSONObject, boolean z10, List<String> list) throws JSONException {
        String parent = z10 ? readParent(parsingContext, jSONObject) : readOptionalParent(parsingContext, jSONObject);
        if (parent != null) {
            list.add(parent);
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (obj instanceof JSONObject) {
                INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj, false, list);
            }
        }
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            Object obj2 = jSONObject.get(itKeys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj3 = jSONArray.get(i10);
                    if (obj3 instanceof JSONObject) {
                        INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj3, false, list);
                    }
                }
            }
        }
    }

    private final Map<String, List<String>> parseTypeDependencies(ParsingContext parsingContext, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                ArrayList arrayList = new ArrayList();
                INSTANCE.readObjectDependencies(parsingContext, new TemplateParsingErrorLogger(parsingContext.getLogger(), next), jSONObject2, true, arrayList);
                linkedHashMap.put(next, arrayList);
            }
        }
        return linkedHashMap;
    }

    private final String readOptionalParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    private final String readParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.read(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TYPE_VALIDATOR$lambda$0(String str) {
        if (str.length() > 0) {
            return true;
        }
        return false;
    }

    private final void processType(String str, Map<String, List<String>> map, Set<String> set, Set<String> set2, LinkedHashMap<String, Set<String>> linkedHashMap) throws CyclicDependencyException {
        List listK;
        boolean z10;
        if (!set.contains(str)) {
            if (set2.contains(str)) {
                return;
            }
            List<String> list = map.get(str);
            if (list != null) {
                listK = new ArrayList();
                for (Object obj : list) {
                    if (map.containsKey((String) obj)) {
                        listK.add(obj);
                    }
                }
            } else {
                listK = null;
            }
            if (listK != null && !listK.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                set.add(str);
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    processType((String) it.next(), map, set, set2, linkedHashMap);
                }
                set.remove(str);
            }
            set2.add(str);
            if (listK == null) {
                listK = s.k();
            }
            linkedHashMap.put(str, b0.T0(listK));
            return;
        }
        throwCyclicDependency(b0.O0(set), str);
        throw new KotlinNothingValueException();
    }

    private final Void throwCyclicDependency(List<String> list, String str) throws CyclicDependencyException {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int iIndexOf = list.indexOf(str); iIndexOf < size; iIndexOf++) {
            sb2.append(list.get(iIndexOf));
            sb2.append(" -> ");
        }
        sb2.append(str);
        throw new CyclicDependencyException(sb2.toString());
    }

    public final Map<String, Set<String>> sort(ParsingContext parsingContext, JSONObject jSONObject) throws JSONException, ParsingException, CyclicDependencyException {
        Map<String, List<String>> typeDependencies = parseTypeDependencies(parsingContext, jSONObject);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
        Iterator<String> it = typeDependencies.keySet().iterator();
        while (it.hasNext()) {
            processType(it.next(), typeDependencies, linkedHashSet, linkedHashSet2, linkedHashMap);
        }
        return linkedHashMap;
    }
}
