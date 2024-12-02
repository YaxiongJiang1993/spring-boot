/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.davih.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.davih.service.UserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController.
 *
 * @author David Jiang
 * @since 1.0.0
 */
@RestController
public class UserController {

	@Lazy
	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String test() {
		return this.userService.test();
	}

}
