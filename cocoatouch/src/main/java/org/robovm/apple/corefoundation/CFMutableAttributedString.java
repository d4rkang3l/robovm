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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFMutableAttributedString/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CFMutableAttributedString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFAttributedStringCreateMutableCopy")
    public static native CFMutableAttributedString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, CFAttributedString aStr);
    @Bridge(symbol="CFAttributedStringCreateMutable")
    public static native CFMutableAttributedString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @Bridge(symbol="CFAttributedStringReplaceString")
    public static native void replaceString(CFAttributedString aStr, @ByVal CFRange range, CFString replacement);
    @Bridge(symbol="CFAttributedStringGetMutableString")
    public static native CFString getMutableString(CFAttributedString aStr);
    @Bridge(symbol="CFAttributedStringSetAttributes")
    public static native void setAttributes(CFAttributedString aStr, @ByVal CFRange range, CFDictionary replacement, boolean clearOtherAttributes);
    @Bridge(symbol="CFAttributedStringSetAttribute")
    public static native void setAttribute(CFAttributedString aStr, @ByVal CFRange range, CFString attrName, CFType value);
    @Bridge(symbol="CFAttributedStringRemoveAttribute")
    public static native void removeAttribute(CFAttributedString aStr, @ByVal CFRange range, CFString attrName);
    @Bridge(symbol="CFAttributedStringReplaceAttributedString")
    public static native void replaceAttributedString(CFAttributedString aStr, @ByVal CFRange range, CFAttributedString replacement);
    @Bridge(symbol="CFAttributedStringBeginEditing")
    public static native void beginEditing(CFAttributedString aStr);
    @Bridge(symbol="CFAttributedStringEndEditing")
    public static native void endEditing(CFAttributedString aStr);
    /*</methods>*/
}
