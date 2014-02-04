/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.presentation.eclipseday.resources;

import static org.jrebirth.core.resource.Resources.create;

import org.jrebirth.core.resource.image.ImageExtension;
import org.jrebirth.core.resource.image.ImageItem;
import org.jrebirth.core.resource.image.LocalImage;

/**
 * The EDPImages interface providing all images.
 */
public interface EDPImages {

    /** The background image used by place slide. */
    ImageItem PLACE_BG = create(new LocalImage("intro", "eclipseDay_intro", ImageExtension.JPG));

    /** The background image used by place slide. */
    ImageItem BG = create(new LocalImage("background_eclipse", ImageExtension.JPG));

    /** . */
    ImageItem NODE = create(new LocalImage("node", "think_node", ImageExtension.JPG));

    /** . */
    ImageItem TREE = create(new LocalImage("node", "think_tree", ImageExtension.JPG));
}