/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPrintPaper_Class/Reference/Reference.html">UIPrintPaper Class Reference</a>
 *   @since Available in iOS 4.2 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIPrintPaper /*</name>*/ 
    extends /*<extends>*/ NSObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIPrintPaper /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIPrintPaper /*</name>*/.class);

    /*<constructors>*/
    protected UIPrintPaper(SkipInit skipInit) { super(skipInit); }
    public UIPrintPaper() {}
    
    /*</constructors>*/
    /*<properties>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPrintPaper_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPaper/paperSize">@property(readonly) CGSize paperSize</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("paperSize") public native CGSize getPaperSize();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPrintPaper_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPaper/printableRect">@property(readonly) CGRect printableRect</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("printableRect") public native CGRect getPrintableRect();
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector bestPaperForPageSize$withPapersFromArray$ = Selector.register("bestPaperForPageSize:withPapersFromArray:");
    @Bridge(symbol = "objc_msgSend") private native static UIPrintPaper objc_forPageSize(ObjCClass __self__, Selector __cmd__, CGSize pageSize, NSArray paperList);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPrintPaper_Class/Reference/Reference.html#//apple_ref/occ/clm/UIPrintPaper/bestPaperForPageSize:withPapersFromArray:">+ (UIPrintPaper *)bestPaperForPageSize:(CGSize)pageSize withPapersFromArray:(NSArray *)paperList</a>
     * @since Available in iOS 4.2 and later.
     */
    public static UIPrintPaper forPageSize(CGSize pageSize, NSArray paperList) {
        return objc_forPageSize(objCClass, bestPaperForPageSize$withPapersFromArray$, pageSize, paperList);
    }
    /*</methods>*/

}
