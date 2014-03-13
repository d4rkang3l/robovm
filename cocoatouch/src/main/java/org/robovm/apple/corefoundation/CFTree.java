/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.corefoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFTree/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFTreePtr extends Ptr<CFTree, CFTreePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFTree.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFTree() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFTreeGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFTreeCreate")
    public static native CFTree create(CFAllocator allocator, CFTreeContext context);
    @Bridge(symbol="CFTreeGetParent")
    public native CFTree getParent();
    @Bridge(symbol="CFTreeGetNextSibling")
    public native CFTree getNextSibling();
    @Bridge(symbol="CFTreeGetFirstChild")
    public native CFTree getFirstChild();
    @Bridge(symbol="CFTreeGetContext")
    public native void getContext(CFTreeContext context);
    @Bridge(symbol="CFTreeGetChildCount")
    public native @MachineSizedSInt long getChildCount();
    @Bridge(symbol="CFTreeGetChildAtIndex")
    public native CFTree getChildAtIndex(@MachineSizedSInt long idx);
    @Bridge(symbol="CFTreeGetChildren")
    public native void getChildren(CFTree.CFTreePtr children);
    @Bridge(symbol="CFTreeApplyFunctionToChildren")
    public native void applyFunctionToChildren(FunctionPtr applier, VoidPtr context);
    @Bridge(symbol="CFTreeFindRoot")
    public native CFTree findRoot();
    @Bridge(symbol="CFTreeSetContext")
    public native void setContext(CFTreeContext context);
    @Bridge(symbol="CFTreePrependChild")
    public native void prependChild(CFTree newChild);
    @Bridge(symbol="CFTreeAppendChild")
    public native void appendChild(CFTree newChild);
    @Bridge(symbol="CFTreeInsertSibling")
    public native void insertSibling(CFTree newSibling);
    @Bridge(symbol="CFTreeRemove")
    public native void remove();
    @Bridge(symbol="CFTreeRemoveAllChildren")
    public native void removeAllChildren();
    @Bridge(symbol="CFTreeSortChildren")
    public native void sortChildren(FunctionPtr comparator, VoidPtr context);
    /*</methods>*/
}
