// Copyright 2008 Thiago H. de Paula Figueiredo
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package br.com.arsmachina.tapestrycrud;

import org.apache.tapestry5.beaneditor.BeanModel;
import org.apache.tapestry5.corelib.components.Grid;

import br.com.arsmachina.tapestrycrud.components.ActionLinks;
import br.com.arsmachina.tapestrycrud.module.TapestryCrudModule;

/**
 * Class that holds some constants related to Tapestry CRUD.
 * 
 * @author Thiago H. de Paula Figueiredo
 */
final public class Constants {

	/**
	 * Tapestry CRUD library prefix.
	 */
	final public static String TAPESTRY_CRUD_LIBRARY_PREFIX = "crud";

	/**
	 * Tapestry data type that includes any {@link TapestryCrudModule} entity.
	 */
	final public static String ENTITY_DATA_TYPE = "entity";

	/**
	 * Event generated by the remove link in the {@link ActionLinks} component.
	 */
	final public static String REMOVE_OBJECT_ACTION = "removeObject";

	/**
	 * Form id (t:id). All event handler methods is this class expect a form with this id.
	 */
	final public static String FORM_ID = "form";

	/**
	 * Message shown after a successful object save or update.
	 */
	final public static String MESSAGE_SAVEORUPDATE_SUCCESS = "message.success.saveorupdate";

	/**
	 * Tapestry CRUD CSS asset path.
	 */
	final public static String TAPESTRY_CRUD_CSS_ASSET = "classpath:/br/com/arsmachina/tapestrycrud/components/css/tapestry-crud.css";

	/**
	 * Remove object success message key.
	 */
	final public static String MESSAGE_SUCCESS_REMOVE = "message.success.remove";

	/**
	 * Remove object success error (remove not allowed) key.
	 */
	final public static String MESSAGE_ERROR_REMOVE_NOT_ALLOWED = "message.error.remove.notallowed";

	/**
	 * Remove object success error (object not found) key.
	 */
	final public static String MESSAGE_ERROR_REMOVE_NOT_FOUND = "message.error.remove.notfound";

	/**
	 * Name of the pseudo-property added to the {@link BeanModel} returned by
	 * {@link #getBeanModel()} to hold actions related to an object in a {@link Grid}.
	 */
	final public static String ACTION_PROPERTY_NAME = "action";

	/**
	 * Name of the pseudo-property added to the {@link BeanModel} returned by
	 * {@link #getBeanModel()} to hold actions related to an object in a {@link Grid}.
	 */
	final public static String REMOVE_COMPONENT_ID = "remove";

	/**
	 * Default zone ID to be returned by AJAX form submissions.
	 */
	final public static String DEFAULT_FORM_ZONE_ID = "zone";

	/**
	 * Default block ID to be returned by AJAX form submissions.
	 */
	final public static String DEFAULT_FORM_BLOCK_ID = "block";

	/**
	 * New object event.
	 */
	final public static String NEW_OBJECT_EVENT = "newObject";

	/**
	 * Prefix used in page title keys.
	 */
	final public static String PAGE_TITLE_MESSAGE_PREFIX = "page.title.";

	/**
	 * Page used to declared the {@link BeanModel} blocks provided by Tapestry CRUD.
	 */
	final public static String BEAN_MODEL_BLOCKS_PAGE = TAPESTRY_CRUD_LIBRARY_PREFIX
			+ "/BeanModelBlocks";

	/**
	 * Single constructor of this class.
	 */
	private Constants() {
	}

}
