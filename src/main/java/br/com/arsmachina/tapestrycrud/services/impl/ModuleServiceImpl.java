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

package br.com.arsmachina.tapestrycrud.services.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.tapestry5.PrimaryKeyEncoder;

import br.com.arsmachina.controller.Controller;
import br.com.arsmachina.dao.DAO;
import br.com.arsmachina.tapestrycrud.encoder.ActivationContextEncoder;
import br.com.arsmachina.tapestrycrud.encoder.Encoder;
import br.com.arsmachina.tapestrycrud.encoder.LabelEncoder;
import br.com.arsmachina.tapestrycrud.module.Module;
import br.com.arsmachina.tapestrycrud.services.ModuleService;

/**
 * Default {@link ModuleService} implementation.
 * 
 * @author Thiago H. de Paula Figueiredo
 */
public class ModuleServiceImpl implements ModuleService {

	final private Set<Module> modules;

	final private Set<Class<?>> entityClasses;
	
	/**
	 * Single constructor of this class.
	 * 
	 * @param entityClasses a {@link Set} of {@link Class} instances. It cannot be null.
	 */
	public ModuleServiceImpl(Set<Module> modules) {

		if (modules == null) {
			throw new IllegalArgumentException("Parameter modules cannot be null");
		}

		this.modules = Collections.unmodifiableSet(modules);

		Set<Class<?>> set = new HashSet<Class<?>>();

		for (Module module : modules) {

			final Set<Class<?>> entityClasses = module.getEntityClasses();

			for (Class<?> entityClass : entityClasses) {
				set.add(entityClass);
			}

		}

		entityClasses = Collections.unmodifiableSet(set);

	}

	public Set<Module> getModules() {
		return modules;
	}

	public Set<Class<?>> getEntityClasses() {
		return entityClasses;
	}

	public <T> Class<? extends ActivationContextEncoder<T>> getActivationContextEncoderClass(
			Class<T> entityClass) {
		
		Class<? extends ActivationContextEncoder<T>> encoder = null;
		
		for (Module module : modules) {
			
			encoder = module.getActivationContextEncoderClass(entityClass);
			
			if (encoder != null) {
				break;
			}
			
		}
		
		return encoder;
		
	}

	public <T> Class<? extends Encoder<T, ?>> getEncoderClass(
			Class<T> entityClass) {
		
		Class<? extends Encoder<T, ?>> encoder = null;
		
		for (Module module : modules) {
			
			encoder = module.getEncoderClass(entityClass);
			
			if (encoder != null) {
				break;
			}
			
		}
		
		return encoder;
		
	}

	public <T> Class<? extends Controller<T, ?>> getControllerImplementationClass(Class<T> entityClass) {

		Class<? extends Controller<T, ?>> controller = null;
		
		for (Module module : modules) {
			
			controller = module.getControllerImplementationClass(entityClass);
			
			if (controller != null) {
				break;
			}
			
		}
		
		return controller;
		
	}

	public <T> Class<? extends Controller<T, ?>> getControllerDefinitionClass(Class<T> entityClass) {

		Class<? extends Controller<T, ?>> controller = null;
		
		for (Module module : modules) {
			
			controller = module.getControllerDefinitionClass(entityClass);
			
			if (controller != null) {
				break;
			}
			
		}
		
		return controller;
		
	}

	public <T> Class<? extends DAO<T, ?>> getDAOImplementationClass(Class<T> entityClass) {

		Class<? extends DAO<T, ?>> dao = null;
		
		for (Module module : modules) {
			
			dao = module.getDAOImplementationClass(entityClass);
			
			if (dao != null) {
				break;
			}
			
		}
		
		return dao;
		
	}

	public <T> Class<? extends DAO<T, ?>> getDAODefinitionClass(Class<T> entityClass) {

		Class<? extends DAO<T, ?>> dao = null;
		
		for (Module module : modules) {
			
			dao = module.getDAODefinitionClass(entityClass);
			
			if (dao != null) {
				break;
			}
			
		}
		
		return dao;
		
	}

	public <T> Class<? extends LabelEncoder<T>> getLabelEncoderClass(Class<T> entityClass) {
		
		Class<? extends LabelEncoder<T>> encoder = null;
		
		for (Module module : modules) {
			
			encoder = module.getLabelEncoderClass(entityClass);
			
			if (encoder != null) {
				break;
			}
			
		}
		
		return encoder;

		
	}

	public <T> Class<? extends PrimaryKeyEncoder<?, T>> getPrimaryKeyEncoderClass(
			Class<T> entityClass) {

		Class<? extends PrimaryKeyEncoder<?, T>> encoder = null;
		
		for (Module module : modules) {
			
			encoder = module.getPrimaryKeyEncoderClass(entityClass);
			
			if (encoder != null) {
				break;
			}
			
		}
		
		return encoder;

	}

}