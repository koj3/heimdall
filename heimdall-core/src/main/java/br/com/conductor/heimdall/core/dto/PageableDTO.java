
package br.com.conductor.heimdall.core.dto;

/*-
 * =========================LICENSE_START==================================
 * heimdall-core
 * ========================================================================
 * Copyright (C) 2018 Conductor Tecnologia SA
 * ========================================================================
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
 * ==========================LICENSE_END===================================
 */

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import br.com.conductor.heimdall.core.util.Pageable;
import lombok.Data;

/**
 * Class is a Data Transfer Object for the {@link Pageable}.
 *
 * @author Filipe Germano
 *
 */
@Data
public class PageableDTO implements Serializable {

     private static final long serialVersionUID = -3593999942005387183L;

     @Min(0)
     private Integer offset;

     @Min(0)
     @Max(100)
     private Integer limit;

}
