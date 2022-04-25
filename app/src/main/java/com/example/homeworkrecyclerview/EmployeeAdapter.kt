package com.example.homeworkrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class EmployeesDiffUtilCallback(
    private val oldList: List<Employee>,
    private val newList: List<Employee>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size
    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = oldList[oldItemPosition]
        val newEmployee = newList[newItemPosition]

        return oldEmployee.id == newEmployee.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = oldList[oldItemPosition]
        val newEmployee = newList[newItemPosition]

        return oldEmployee == newEmployee
    }

}

class EmployeeAdapter(private val deleteAction: (Int) -> Unit) : RecyclerView.Adapter<EmployeeAdapter.EmployeesViewHolder>() {

    var employees: List<Employee> = emptyList()
        set(newValue) {
            val diffUtilCallback = EmployeesDiffUtilCallback(field, newValue)
            val diffResult = DiffUtil.calculateDiff(diffUtilCallback)
            field = newValue
            diffResult.dispatchUpdatesTo(this)
        }

    class EmployeesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoImageView: ImageView = itemView.findViewById(R.id.photo)
        val fullnameTextView: TextView = itemView.findViewById(R.id.fullname)
        val departmentTextView: TextView = itemView.findViewById(R.id.department)
        val deleteButton: ImageView = itemView.findViewById(R.id.delete_button)
        val favoriteEmployee: ImageView = itemView.findViewById(R.id.heart)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.employee_list_item, parent, false)
        return EmployeesViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeesViewHolder, position: Int) {
        val employee = employees[position]
        with(holder) {
            fullnameTextView.text = employee.fullName
            departmentTextView.text = employee.department

            Glide.with(photoImageView.context)
                .load(employee.photoUrl)
                .centerCrop()
                .into(photoImageView)

            deleteButton.setOnClickListener {
                deleteAction(position)
            }

            itemView.setOnClickListener {
                favoriteEmployee.visibility = View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return employees.size
    }
}