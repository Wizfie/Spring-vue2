<template>
  <div class="d-flex" >
    <div v-for="(item,index) in studentData" :key="item.id">
        <div class="card border border-primary d-flex  m-5" style="width: 18rem; ">
        <div class="card-body " >
          <p class="d-none">
            {{index + 1}}
          </p>
        <h4 class="card-title text-center">{{item.nama  }}</h4>
        <h6 class="card-subtitle mb-4 text-center">{{item.umur+" "+"Year Old"}}</h6>
        <hr>
        <p class="card-text mb-5">{{item.deskripsi_diri}}</p>
        
        <p class="card-subtitle mb-2 ">{{"Email :" + " "+ item.email}}</p>
        <p class="card-subtitle mb-2 ">{{"Soft Skill :" + " "+ item.soft_skill}}</p>
        <p class="card-subtitle mb-2 ">{{"Hard Skill :" + " "+ item.hard_skill}}</p>
        <p class="card-subtitle mb-3 ">{{"Interest :" + " "+ item.interest}}</p>

        <router-link :to="{name: 'updateData', params:{ id : item.id}} ">
              <button class="btn btn-sm btn-warning mr-2 text-white">Update</button>
        </router-link>

      <button class="btn btn-sm btn-danger" @click="deleteStudentFunc(item.id)">Delete</button>  
        <img style="width:13% ;margin-left:10%" src="../assets/female.png" alt=""  v-show="item.jenis_kelamin === 'Female'" >
        <img style="width:20% ;margin-left:10%" src="../assets/male.png" alt=""  v-show="item.jenis_kelamin === 'Male'" >
      
        </div>
        </div>

    </div>
      
  </div>
</template>

<script>
import StudentService from "../Services/studentService"
export default {
    name:"CardData",
    methods: {
      getStudent(){
        StudentService.getAll().then(response => {
          this.studentData = response.data;
          console.log(this.studentData);
        })
        .catch(e => {
          console.log(e);
        });
      },

      deleteStudentFunc(id){
        if(confirm("Apakah anda yakin hapus?")){
          StudentService.deleteStudent(id).then(response =>{
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          })
          location.reload()
        }else{
          alert("Hapus dibatalkan")
        }
      }
  },
  mounted(){
    this.getStudent();
  },
  data(){
    return{
      studentData : null,
    }
  }
}
</script>

<style>

</style>