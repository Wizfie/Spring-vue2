<template>
  <div>
  <router-link to="/">
  <button id="myButton" class="btn btn-primary m-3">Back</button>
</router-link>
       <div class=" p-4 border border-primary"  id="box" style="width: fit-content; margin: auto; margin-top: 5%;" >
        <div>
      <h1 class="text-center">Add Student</h1>
        </div>
        <form>
            <div class="form-row d-flex" >
              <div class="col-md-6 mb-3">
                <label for="validationDefault01">Student Name</label>
                <input type="text" class="form-control" id="firstname" placeholder="Full Name" value="" >
              </div>
              <div class="col-md-6 mb-3">
                <label for="validationDefault02">Soft Skill</label>
                <input type="text" class="form-control" id="softskill" placeholder="" value="" >
              </div>
            </div>

            <div class="form-row">
                <div class="col-md-3 mb-3">
                    <label for="validationDefault01">Student Age</label>
                    <input type="number" class="form-control" id="age" placeholder="Age" value="" >
                </div>
                <div class="col-md-3 mb-3">
                    <label for="validationDefault02">Gender</label>
                    <select class="custom-select" id="inputGroupSelect02">
                    <option selected></option>
                    <option value="1">Male</option>
                    <option value="2">Female</option>
                  </select>
                </div>
                <div class="col-md-6 mb-3">
                    <label for="validationDefault02">Hard Skill</label>
                    <input type="text" class="form-control" id="hardskill" placeholder="" value="" >
                </div>

              </div>
              
              <div class="form-row">
                  <div class="col mb-6">
                  <label for="Email">Email</label>
                  <input type="text" class="form-control">
                </div>

                <div class="col mb-6">
                  <label for="Interest">Interest</label>
                  <select class="custom-select" id="inputGroupSelect02">
                    <option selected></option>
                    <option value="1">Web Frontend</option>
                    <option value="2">Web Backend</option>
                    <option value="3">Mobile Apps</option>
                    <option value="4">Network</option>
                    <option value="5">Data Science</option>
                  </select>
                  
                </div>
                </div>
                    <div class="form-col mt-3">
                      <div>
                      <label for="Description">Description</label>
                      </div>
                      <div>
                        <textarea name="" id="" cols="75" rows="5"></textarea>
                      </div>

                    </div>
                    <div>
                        <button type="button" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>