// Copyright 2008-2009 Thiago H. de Paula Figueiredo
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

package br.com.arsmachina.tapestrycrud.services;

import br.com.arsmachina.tapestrycrud.encoder.Encoder;
import br.com.arsmachina.tapestrycrud.encoder.LabelEncoder;

/**
 * Service that provides {@link LabelEncoder}s.
 * 
 * @author Thiago H. de Paula Figueiredo
 */
public interface LabelEncoderSource {

	/**
	 * Returns the {@link LabelEncoder} of a given type.
	 * 
	 * @param <T> a type.
	 * @param clasz a {@link Class}.
	 * @return an {@link Encoder}.
	 */
	<T> LabelEncoder<T> get(Class<T> clasz);

}
