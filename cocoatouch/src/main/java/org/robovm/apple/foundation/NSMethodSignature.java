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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMethodSignature/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSMethodSignaturePtr extends Ptr<NSMethodSignature, NSMethodSignaturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMethodSignature.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMethodSignature() {}
    protected NSMethodSignature(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "numberOfArguments")
    public native @MachineSizedUInt long numberOfArguments();
    @Method(selector = "getArgumentTypeAtIndex:")
    public native BytePtr getArgumentTypeAtIndex$(@MachineSizedUInt long idx);
    @Method(selector = "frameLength")
    public native @MachineSizedUInt long frameLength();
    @Method(selector = "isOneway")
    public native boolean isOneway();
    @Method(selector = "methodReturnType")
    public native BytePtr methodReturnType();
    @Method(selector = "methodReturnLength")
    public native @MachineSizedUInt long methodReturnLength();
    @Method(selector = "signatureWithObjCTypes:")
    public static native NSMethodSignature signatureWithObjCTypes$(BytePtr types);
    /*</methods>*/
}
