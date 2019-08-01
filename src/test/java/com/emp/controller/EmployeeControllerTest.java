package com.emp.controller;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest
public class EmployeeControllerTest {

	/*
	 * private MockMvc mockMvc;
	 * 
	 * @Mock EmployeeServiceImpl employeeService;
	 * 
	 * @InjectMocks EmployeeController employeeController;
	 * 
	 * @Before public void init(){ MockitoAnnotations.initMocks(this); mockMvc =
	 * MockMvcBuilders .standaloneSetup(employeeController) .build(); }
	 * 
	 * @Test public void testCreateEmployee() {
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Test public void testDeleteEmployee() { }
	 * 
	 * @Test public void testGetEmployee() throws Exception{
	 * 
	 * Employee user = new Employee(1, "mahesh", "gowtham", "bangalore",
	 * "engineer");
	 * 
	 * when(employeeService.getEmployeeById(1)).thenReturn(user);
	 * 
	 * mockMvc.perform(get("/users/{id}", 1)) .andExpect(status().isOk())
	 * .andExpect((ResultMatcher)
	 * content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
	 * .andExpect(jsonPath("$.empId", is(1))) .andExpect(jsonPath("$.empFirstName",
	 * is("mahesh")));
	 * 
	 * verify(employeeService, times(1)).getEmployeeById(1);
	 * verifyNoMoreInteractions(employeeService); }
	 * 
	 * @Test public void testGetEmpList() throws Exception{
	 * 
	 * List<Employee> emp = new ArrayList<>(); Employee e1 = new Employee(1,
	 * "mahesh", "gowtham", "bangalore", "engineer"); Employee e2 = new Employee(2,
	 * "shiva", "kumar", "bangalore", "engineer"); emp.add(e1);emp.add(e2);
	 * when(employeeService.getEmployeeList()).thenReturn(emp);
	 * mockMvc.perform(get("/getEmployeeList")).andExpect(status().isOk()).andExpect
	 * ((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON));
	 * 
	 * 
	 * verify(employeeService, times(1)).getEmployeeById(1);
	 * verifyNoMoreInteractions(employeeService);
	 * 
	 * 
	 * assertEquals(2, emp.size()); }
	 * 
	 * @Test public void testUpdateEmployee() { }
	 * 
	 * @Test public void testDeletaAllEmployee() { }
	 */

}
