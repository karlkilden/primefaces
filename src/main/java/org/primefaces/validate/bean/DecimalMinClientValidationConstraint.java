/*
 * Copyright 2009-2013 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.validate.bean;

import java.util.HashMap;
import java.util.Map;
import javax.faces.validator.DoubleRangeValidator;
import javax.validation.metadata.ConstraintDescriptor;
import org.primefaces.util.HTML;

public class DecimalMinClientValidationConstraint implements ClientValidationConstraint {

    public Map<String, Object> getMetadata(ConstraintDescriptor constraintDescriptor) {
        Map<String,Object> metadata = new HashMap<String, Object>();
        Map attrs = constraintDescriptor.getAttributes();
        Object value = attrs.get("value");
        
        if(value != null)
            metadata.put(HTML.VALIDATION_METADATA.MIN_VALUE, value);
        
        return metadata;
    }
    
    public String getValidatorId() {
        return DoubleRangeValidator.VALIDATOR_ID;
    }
}